package br.senac.sp.backend.formulario.controller.request;

public class FormularioRequest {

    private Integer numero;
    private String nome;

    public FormularioRequest(){}

    public FormularioRequest(Integer numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public FormularioRequest setNumero(Integer numero) {
        this.numero = numero;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public FormularioRequest setNome(String nome) {
        this.nome = nome;
        return this;
    }

}