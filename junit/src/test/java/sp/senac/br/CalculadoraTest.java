package sp.senac.br;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculadoraTest {

    @Mock
    private CalculadoraService calculadoraService;
    @InjectMocks
    private Calculadora calculadora;

    private static final String SOMAR = "somar";
    private static final String SUBTRAIR = "subtrair";
    private static final String MULTIPLICAR = "multiplicar";
    private static final String DIVIDIR = "dividir";


    @Test
    void testCalcularQuandoSomar(){
        Integer expected = 20;
        // Mock para quando executar getSignal com palavra "mais", entao, retorna "+"
        Mockito.when(calculadoraService.getSignal(SOMAR)).thenReturn("+");
        // Executa metodo a ser testado
        var actual = calculadora.calcular(SOMAR, 10, 10);

        // Criando ArgumentCaptor para capturar os parâmetros
        ArgumentCaptor<String> signalCaptor = ArgumentCaptor.forClass(String.class);
        // Verificando a invocação do método e capturando os argumentos
        Mockito.verify(calculadoraService).getSignal(signalCaptor.capture());
        // Obtendo os valores capturados
        var capturedSignal = signalCaptor.getValue();
        // Verifica se o resultado foi o esperado
        Assertions.assertEquals(expected, actual);
        // Verifica que o metodo getSignal executou com a palavra somar
        Assertions.assertEquals(SOMAR, capturedSignal);
    }

    @Test
    void testCalcularQuandoSubtrair(){
        Integer expected = 0;
        Mockito.when(calculadoraService.getSignal(SUBTRAIR)).thenReturn("-");
        var actual = calculadora.calcular(SUBTRAIR, 10, 10);

        ArgumentCaptor<String> signalCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(calculadoraService).getSignal(signalCaptor.capture());
        var capturedSignal = signalCaptor.getValue();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(SUBTRAIR, capturedSignal);

    }

    @Test
    void testCalcularQuandoDividir(){
        Integer expected = 1;
        Mockito.when(calculadoraService.getSignal(DIVIDIR)).thenReturn("/");
        var actual = calculadora.calcular(DIVIDIR, 10, 10);

        ArgumentCaptor<String> signalCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(calculadoraService).getSignal(signalCaptor.capture());
        var capturedSignal = signalCaptor.getValue();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(DIVIDIR, capturedSignal);
    }

    @Test
    void testCalcularQuandoMultiplicar(){
        Integer expected = 100;
        Mockito.when(calculadoraService.getSignal(MULTIPLICAR)).thenReturn("*");
        var actual = calculadora.calcular(MULTIPLICAR, 10, 10);

        ArgumentCaptor<String> signalCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(calculadoraService).getSignal(signalCaptor.capture());
        var capturedSignal = signalCaptor.getValue();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(MULTIPLICAR, capturedSignal);
    }

}
