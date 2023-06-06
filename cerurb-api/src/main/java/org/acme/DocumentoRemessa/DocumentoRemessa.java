package org.acme.DocumentoRemessa;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class DocumentoRemessa extends PanacheEntity{
    
    private Long id;
    private String nome;
    private String arquivo;
    private String tipo;

    public DocumentoRemessa() {
    }
    
    public DocumentoRemessa(Long id, String nome, String arquivo, String tipo) {
        this.id = id;
        this.nome = nome;
        this.arquivo = arquivo;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getArquivo() {
        return arquivo;
    }
    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
