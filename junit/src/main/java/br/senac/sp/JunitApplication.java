package br.senac.sp;

public class JunitApplication {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(new CalculadoraService());
        Integer result = calculadora.calcular("dividir", 50, 10);
        System.out.println("Resultado = " + result);

    }

}