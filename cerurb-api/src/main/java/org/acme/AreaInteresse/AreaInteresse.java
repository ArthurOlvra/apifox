package org.acme.AreaInteresse;

import org.acme.TipoAreaInteresse.TipoAreaInteresse;

public class AreaInteresse {
    
    private TipoAreaInteresse tipo;

    private String nome;

    private String cadastro_estadual;

    public AreaInteresse() {
    }

    public AreaInteresse(TipoAreaInteresse tipo, String nome, String cadastro_estadual) {
        this.tipo = tipo;
        this.nome = nome;
        this.cadastro_estadual = cadastro_estadual;
    }

    public TipoAreaInteresse getTipo() {
        return tipo;
    }

    public void setTipo(TipoAreaInteresse tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCadastro_estadual() {
        return cadastro_estadual;
    }

    public void setCadastro_estadual(String cadastro_estadual) {
        this.cadastro_estadual = cadastro_estadual;
    }

}
