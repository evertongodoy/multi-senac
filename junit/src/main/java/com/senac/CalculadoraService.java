package com.senac;

public class CalculadoraService {

    public String getAcao(String acao){
        if(acao.equalsIgnoreCase("somar")){
            return "+";
        } else if (acao.equalsIgnoreCase("subtrair")) {
            return "-";
        } else if (acao.equalsIgnoreCase("dividir")) {
            return "/";
        } else if (acao.equalsIgnoreCase("multiplicar")) {
            return "*";
        } else {
            throw new RuntimeException("Acao nao localizada");
        }
    }

}
