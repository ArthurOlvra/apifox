package org.acme.Requerente;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Requerente extends PanacheEntity{
    
    private String telefone_solicitante;

    private String nome_apresentante;

    private String codigo_ibge_cidade_apresentante;

    private String numero;

    private String endereco_apresentante;

    private String bairro;

    private String cpf_cnpj_apresentante;

    private String telefone_apresentante;

    private String cidade_apresentante;

    private String email_solicitante;

    private String email_apresentante;

    private String complemento;

    private String nome_solicitante;

    private String cep_apresentante;

    private String uf_apresentante;

    public Requerente() {
    }

    public Requerente(String telefone_solicitante, String nome_apresentante, String codigo_ibge_cidade_apresentante,
            String numero, String endereco_apresentante, String bairro, String cpf_cnpj_apresentante,
            String telefone_apresentante, String cidade_apresentante, String email_solicitante,
            String email_apresentante, String complemento, String nome_solicitante, String cep_apresentante,
            String uf_apresentante) {
        this.telefone_solicitante = telefone_solicitante;
        this.nome_apresentante = nome_apresentante;
        this.codigo_ibge_cidade_apresentante = codigo_ibge_cidade_apresentante;
        this.numero = numero;
        this.endereco_apresentante = endereco_apresentante;
        this.bairro = bairro;
        this.cpf_cnpj_apresentante = cpf_cnpj_apresentante;
        this.telefone_apresentante = telefone_apresentante;
        this.cidade_apresentante = cidade_apresentante;
        this.email_solicitante = email_solicitante;
        this.email_apresentante = email_apresentante;
        this.complemento = complemento;
        this.nome_solicitante = nome_solicitante;
        this.cep_apresentante = cep_apresentante;
        this.uf_apresentante = uf_apresentante;
    }

    public String getTelefone_solicitante() {
        return telefone_solicitante;
    }

    public void setTelefone_solicitante(String telefone_solicitante) {
        this.telefone_solicitante = telefone_solicitante;
    }

    public String getNome_apresentante() {
        return nome_apresentante;
    }

    public void setNome_apresentante(String nome_apresentante) {
        this.nome_apresentante = nome_apresentante;
    }

    public String getCodigo_ibge_cidade_apresentante() {
        return codigo_ibge_cidade_apresentante;
    }

    public void setCodigo_ibge_cidade_apresentante(String codigo_ibge_cidade_apresentante) {
        this.codigo_ibge_cidade_apresentante = codigo_ibge_cidade_apresentante;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEndereco_apresentante() {
        return endereco_apresentante;
    }

    public void setEndereco_apresentante(String endereco_apresentante) {
        this.endereco_apresentante = endereco_apresentante;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCpf_cnpj_apresentante() {
        return cpf_cnpj_apresentante;
    }

    public void setCpf_cnpj_apresentante(String cpf_cnpj_apresentante) {
        this.cpf_cnpj_apresentante = cpf_cnpj_apresentante;
    }

    public String getTelefone_apresentante() {
        return telefone_apresentante;
    }

    public void setTelefone_apresentante(String telefone_apresentante) {
        this.telefone_apresentante = telefone_apresentante;
    }

    public String getCidade_apresentante() {
        return cidade_apresentante;
    }

    public void setCidade_apresentante(String cidade_apresentante) {
        this.cidade_apresentante = cidade_apresentante;
    }

    public String getEmail_solicitante() {
        return email_solicitante;
    }

    public void setEmail_solicitante(String email_solicitante) {
        this.email_solicitante = email_solicitante;
    }

    public String getEmail_apresentante() {
        return email_apresentante;
    }

    public void setEmail_apresentante(String email_apresentante) {
        this.email_apresentante = email_apresentante;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNome_solicitante() {
        return nome_solicitante;
    }

    public void setNome_solicitante(String nome_solicitante) {
        this.nome_solicitante = nome_solicitante;
    }

    public String getCep_apresentante() {
        return cep_apresentante;
    }

    public void setCep_apresentante(String cep_apresentante) {
        this.cep_apresentante = cep_apresentante;
    }

    public String getUf_apresentante() {
        return uf_apresentante;
    }

    public void setUf_apresentante(String uf_apresentante) {
        this.uf_apresentante = uf_apresentante;
    }

}
