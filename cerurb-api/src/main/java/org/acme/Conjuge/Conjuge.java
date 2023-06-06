package org.acme.Conjuge;

public class Conjuge {
    
    private String nome;
    
    private String cpf;

    public Conjuge() {
    }

    public Conjuge(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
