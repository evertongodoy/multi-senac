package com.senac;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
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

    @Test
    void testCalcularQuandoSomar(){
        Integer expected = 20;
        Mockito.when(calculadoraService.getAcao("somar")).thenReturn("+");
        var actual = calculadora.calcular("somar", 10, 10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalcularQuandoSubtrair(){
        Integer expected = 0;
        Mockito.when(calculadoraService.getAcao("subtrair")).thenReturn("-");
        var actual = calculadora.calcular("subtrair", 10, 10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalcularQuandoDividir(){
        Integer expected = 1;
        Mockito.when(calculadoraService.getAcao("dividir")).thenReturn("/");
        var actual = calculadora.calcular("dividir", 10, 10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalcularQuandoMultiplicar(){
        Integer expected = 100;
        Mockito.when(calculadoraService.getAcao("multiplicar")).thenReturn("*");
        var actual = calculadora.calcular("multiplicar", 10, 10);
        Assertions.assertEquals(expected, actual);
    }

}
