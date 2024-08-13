package com.senac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculadoraServiceTest {


    private final CalculadoraService calculadoraService = new CalculadoraService();

    @Test
    void testGetAcaoSomar() {
        String actual = calculadoraService.getAcao("somar");
        var expected = "+";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetAcaoSubtrair() {
        String actual = calculadoraService.getAcao("subtrair");
        var expected = "-";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetAcaoMultiplicar() {
        String actual = calculadoraService.getAcao("multiplicar");
        var expected = "*";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetAcaoDividir() {
        String actual = calculadoraService.getAcao("dividir");
        var expected = "/";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetAcaoThrowException() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class,
                () -> calculadoraService.getAcao("naoExisteAcao"));
        Assertions.assertEquals("Acao nao localizada", exception.getMessage());

    }
}
