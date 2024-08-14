package com.senac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculadoraServiceTest {


    private final CalculadoraService calculadoraService = new CalculadoraService();

    @Test
    void testGetSignalSomar() {
        String actual = calculadoraService.getSignal("somar");
        var expected = "+";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetSignalSubtrair() {
        String actual = calculadoraService.getSignal("subtrair");
        var expected = "-";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetSignalMultiplicar() {
        String actual = calculadoraService.getSignal("multiplicar");
        var expected = "*";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetSignalDividir() {
        String actual = calculadoraService.getSignal("dividir");
        var expected = "/";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetSignalThrowException() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class,
                () -> calculadoraService.getSignal("naoExisteAcao"));
        Assertions.assertEquals("Acao nao localizada", exception.getMessage());

    }
}
