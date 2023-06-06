package org.acme.Imovel;

import java.math.BigDecimal;

import javax.persistence.Entity;

import org.acme.Endereco.Endereco;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Imovel extends PanacheEntity{
    
    private BigDecimal dimensoes;
    private Endereco endereco;
    public Imovel() {
    }
    public Imovel(BigDecimal dimensoes, Endereco endereco) {
        this.dimensoes = dimensoes;
        this.endereco = endereco;
    }
    public BigDecimal getDimensoes() {
        return dimensoes;
    }
    public void setDimensoes(BigDecimal dimensoes) {
        this.dimensoes = dimensoes;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
