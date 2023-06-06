package org.acme.MatriculaAnterior;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class MatriculaAnterior extends PanacheEntity{
    
    private String livro;
    
    @Column(name = "numeroMatricula")
    private String numero_matricula;
    
    private String complementoMatricula;
    
    private String cns;

    public MatriculaAnterior() {
    }

    public MatriculaAnterior(String livro, String numero_matricula, String complementoMatricula, String cns) {
        this.livro = livro;
        this.numero_matricula = numero_matricula;
        this.complementoMatricula = complementoMatricula;
        this.cns = cns;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getNumero_matricula() {
        return numero_matricula;
    }

    public void setNumero_matricula(String numero_matricula) {
        this.numero_matricula = numero_matricula;
    }

    public String getComplementoMatricula() {
        return complementoMatricula;
    }

    public void setComplementoMatricula(String complementoMatricula) {
        this.complementoMatricula = complementoMatricula;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

}
