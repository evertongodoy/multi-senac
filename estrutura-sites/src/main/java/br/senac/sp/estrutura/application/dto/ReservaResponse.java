package br.senac.sp.estrutura.application.dto;

public class ReservaResponse {

    private String nome;
    private String email;
    private String data;
    private int pessoas;
    private String animal;
    private String comentario;
    private String telefone;
    private String status;

    public String getNome() {
        return nome;
    }

    public ReservaResponse setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ReservaResponse setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getData() {
        return data;
    }

    public ReservaResponse setData(String data) {
        this.data = data;
        return this;
    }

    public int getPessoas() {
        return pessoas;
    }

    public ReservaResponse setPessoas(int pessoas) {
        this.pessoas = pessoas;
        return this;
    }

    public String getAnimal() {
        return animal;
    }

    public ReservaResponse setAnimal(String animal) {
        this.animal = animal;
        return this;
    }

    public String getComentario() {
        return comentario;
    }

    public ReservaResponse setComentario(String comentario) {
        this.comentario = comentario;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public ReservaResponse setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ReservaResponse setStatus(String status) {
        this.status = status;
        return this;
    }

}