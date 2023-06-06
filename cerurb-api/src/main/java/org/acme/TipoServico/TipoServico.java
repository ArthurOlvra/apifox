package org.acme.TipoServico;

public class TipoServico {
    
    private String codigo;

    public TipoServico() {
    }

    public TipoServico(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
