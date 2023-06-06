package org.acme.MatriculaAnteriorVO;

public class MatriculaAnteriorVO {
    
    private String livro;

    private String numero_matricula;

    private String complemento_matricula;

    private String cns;

    public MatriculaAnteriorVO() {
    }

    public MatriculaAnteriorVO(String livro, String numero_matricula, String complemento_matricula, String cns) {
        this.livro = livro;
        this.numero_matricula = numero_matricula;
        this.complemento_matricula = complemento_matricula;
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

    public String getComplemento_matricula() {
        return complemento_matricula;
    }

    public void setComplemento_matricula(String complemento_matricula) {
        this.complemento_matricula = complemento_matricula;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

}
