package org.acme.Interessados;

import org.acme.Conjuge.Conjuge;
import org.acme.EnderecoInterpi.EnderecoInterpi;

public class Interessados {
    
    private EnderecoInterpi endereco;

    private String razao_social;

    private String nome;

    private String cnpj;

    private String cpf;

    private String estado_civil;

    private String genero;

    private String rg;

    private boolean brasileiro;

    private String profissao;

    private String data_nascimento;

    private String nome_mae;

    private String nome_pai;

    private String orgaoEmissor;

    private Conjuge conjuge;

    public Interessados() {
    }

    public Interessados(EnderecoInterpi endereco, String razao_social, String nome, String cnpj, String cpf,
            String estado_civil, String genero, String rg, boolean brasileiro, String profissao, String data_nascimento,
            String nome_mae, String nome_pai, String orgaoEmissor, Conjuge conjuge) {
        this.endereco = endereco;
        this.razao_social = razao_social;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.estado_civil = estado_civil;
        this.genero = genero;
        this.rg = rg;
        this.brasileiro = brasileiro;
        this.profissao = profissao;
        this.data_nascimento = data_nascimento;
        this.nome_mae = nome_mae;
        this.nome_pai = nome_pai;
        this.orgaoEmissor = orgaoEmissor;
        this.conjuge = conjuge;
    }

    public EnderecoInterpi getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoInterpi endereco) {
        this.endereco = endereco;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isBrasileiro() {
        return brasileiro;
    }

    public void setBrasileiro(boolean brasileiro) {
        this.brasileiro = brasileiro;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public String getNome_pai() {
        return nome_pai;
    }

    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public Conjuge getConjuge() {
        return conjuge;
    }

    public void setConjuge(Conjuge conjuge) {
        this.conjuge = conjuge;
    }


}
