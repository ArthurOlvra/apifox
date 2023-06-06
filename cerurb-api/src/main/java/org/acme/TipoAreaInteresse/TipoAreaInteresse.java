package org.acme.TipoAreaInteresse;

public class TipoAreaInteresse {
    
    private String categoria;
    
    private String nome;

    public TipoAreaInteresse() {
    }

    public TipoAreaInteresse(String categoria, String nome) {
        this.categoria = categoria;
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
