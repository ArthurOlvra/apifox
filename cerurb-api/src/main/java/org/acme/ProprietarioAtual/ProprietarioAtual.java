package org.acme.ProprietarioAtual;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class ProprietarioAtual extends PanacheEntity{
    
    private String cidade;

    private String estado;

    private String telefone;

    private String complemento;

    private String endereco;

    private String codigo_ibge_cidade;

    private String bairro;

    private String instituicao;

    private String numero_endereco;

    private String cnpj;

    private String email;

    private String cep;

    public ProprietarioAtual() {
    }

    public ProprietarioAtual(String cidade, String estado, String telefone, String complemento, String endereco,
            String codigo_ibge_cidade, String bairro, String instituicao, String numero_endereco, String cnpj,
            String email, String cep) {
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.complemento = complemento;
        this.endereco = endereco;
        this.codigo_ibge_cidade = codigo_ibge_cidade;
        this.bairro = bairro;
        this.instituicao = instituicao;
        this.numero_endereco = numero_endereco;
        this.cnpj = cnpj;
        this.email = email;
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCodigo_ibge_cidade() {
        return codigo_ibge_cidade;
    }

    public void setCodigo_ibge_cidade(String codigo_ibge_cidade) {
        this.codigo_ibge_cidade = codigo_ibge_cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getNumero_endereco() {
        return numero_endereco;
    }

    public void setNumero_endereco(String numero_endereco) {
        this.numero_endereco = numero_endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
