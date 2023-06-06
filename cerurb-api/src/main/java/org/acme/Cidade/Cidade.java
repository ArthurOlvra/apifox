package org.acme.Cidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.acme.Estado.Estado;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Cidade extends PanacheEntity{
 
    private String nome;
    
    @ManyToOne
    // @JoinColumn(name = "estado_id", nullable = false, updatable = false)
    @JoinColumn(name = "estado_id")
    private Estado estado;
    @Column(name = "cod_ibge")

    private String codIbge;

    @Column(name = "possui_regularizacao")
    private boolean possuiRegularizacao;

    private boolean ativo;

    private int versao;

    public Cidade() {
    }

    public Cidade(String nome, Estado estado, String codIbge, boolean possuiRegularizacao, boolean ativo, int versao) {
        this.nome = nome;
        this.estado = estado;
        this.codIbge = codIbge;
        this.possuiRegularizacao = possuiRegularizacao;
        this.ativo = ativo;
        this.versao = versao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCodIbge() {
        return codIbge;
    }

    public void setCodIbge(String codIbge) {
        this.codIbge = codIbge;
    }

    public boolean isPossuiRegularizacao() {
        return possuiRegularizacao;
    }

    public void setPossuiRegularizacao(boolean possuiRegularizacao) {
        this.possuiRegularizacao = possuiRegularizacao;
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
