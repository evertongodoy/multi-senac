package br.senac.sp.estrutura.application.dto;

public class ReservaRequest {

    private String nome;
    private String email;
    private String data;
    private int pessoas;
    private String animal;
    private String comentario;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public ReservaRequest setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ReservaRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getData() {
        return data;
    }

    public ReservaRequest setData(String data) {
        this.data = data;
        return this;
    }

    public int getPessoas() {
        return pessoas;
    }

    public ReservaRequest setPessoas(int pessoas) {
        this.pessoas = pessoas;
        return this;
    }

    public String getAnimal() {
        return animal;
    }

    public ReservaRequest setAnimal(String animal) {
        this.animal = animal;
        return this;
    }

    public String getComentario() {
        return comentario;
    }

    public ReservaRequest setComentario(String comentario) {
        this.comentario = comentario;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public ReservaRequest setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }
}
