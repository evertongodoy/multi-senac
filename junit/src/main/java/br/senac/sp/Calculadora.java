package br.senac.sp;

public class Calculadora {

    private final CalculadoraService calculadoraService;

    public Calculadora(final CalculadoraService calculadoraService){
        this.calculadoraService = calculadoraService;
    }

    public Integer calcular(String acao, Integer x, Integer y){
        String sinal = this.getSinal(acao);
        if (sinal.equals("+")){
            return x+y;
        } else if (sinal.equals("-")) {
            return x-y;
        } else if (sinal.equals("*")) {
            return x*y;
        } else {
            return x/y;
        }
    }

    private String getSinal(String acao){
        return calculadoraService.getSignal(acao);
    }
}
