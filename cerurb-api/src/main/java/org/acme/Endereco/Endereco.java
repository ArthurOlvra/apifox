package org.acme.Endereco;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.acme.Bairro.Bairro;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Endereco extends PanacheEntity{

    private Integer codLogradouro;
    private String logradouro;
    private String numero;
    private String compl;
    private Integer codBairro;
    private String bairro;
    private String municipio;
    private String cep;
    private String uf;
    private String nomeslog;
    private String nomeclog;
    @ManyToOne
    private Bairro bairroDne;
    
    public Endereco() {
    }
    
    public Endereco(Integer codLogradouro, String logradouro, String numero, String compl, Integer codBairro,
            String bairro, String municipio, String cep, String uf, String nomeslog, String nomeclog,
            Bairro bairroDne) {
        this.codLogradouro = codLogradouro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.compl = compl;
        this.codBairro = codBairro;
        this.bairro = bairro;
        this.municipio = municipio;
        this.cep = cep;
        this.uf = uf;
        this.nomeslog = nomeslog;
        this.nomeclog = nomeclog;
        this.bairroDne = bairroDne;
    }
    public Integer getCodLogradouro() {
        return codLogradouro;
    }
    public void setCodLogradouro(Integer codLogradouro) {
        this.codLogradouro = codLogradouro;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCompl() {
        return compl;
    }
    public void setCompl(String compl) {
        this.compl = compl;
    }
    public Integer getCodBairro() {
        return codBairro;
    }
    public void setCodBairro(Integer codBairro) {
        this.codBairro = codBairro;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getNomeslog() {
        return nomeslog;
    }
    public void setNomeslog(String nomeslog) {
        this.nomeslog = nomeslog;
    }
    public String getNomeclog() {
        return nomeclog;
    }
    public void setNomeclog(String nomeclog) {
        this.nomeclog = nomeclog;
    }
    public Bairro getBairroDne() {
        return bairroDne;
    }
    public void setBairroDne(Bairro bairroDne) {
        this.bairroDne = bairroDne;
    }
    
}
