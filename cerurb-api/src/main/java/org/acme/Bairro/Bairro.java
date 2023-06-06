package org.acme.Bairro;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.acme.Cidade.Cidade;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Bairro extends PanacheEntity{
    
    @OneToOne
    private Cidade cidade;

    private String nome;

    public Bairro() {
    }

    public Bairro(Cidade cidade, String nome) {
        this.cidade = cidade;
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
