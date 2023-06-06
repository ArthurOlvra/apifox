package org.acme.Estado;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Estado extends PanacheEntity{
 
    private String uf;
    private String nome;
    private boolean ativo;
    private int versao;

    public Estado() {
    }

    public Estado(String uf, String nome, boolean ativo, int versao) {
        this.uf = uf;
        this.nome = nome;
        this.ativo = ativo;
        this.versao = versao;
    }
    
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public int getVersao() {
        return versao;
    }
    public void setVersao(int versao) {
        this.versao = versao;
    }


}
