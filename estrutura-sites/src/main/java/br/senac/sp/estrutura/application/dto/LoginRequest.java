package br.senac.sp.estrutura.application.dto;

public class LoginRequest {

    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public LoginRequest setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public LoginRequest setEmail(String email) {
        this.email = email;
        return this;
    }

}
