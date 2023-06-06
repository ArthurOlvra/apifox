package org.acme.ProcessoImovel;

import java.util.List;

import org.acme.Interessados.Interessados;

public class ProcessoImovel {
 
    private List<Interessados> interessados;

    private String numero_sei;

    public ProcessoImovel() {
    }

    public ProcessoImovel(List<Interessados> interessados, String numero_sei) {
        this.interessados = interessados;
        this.numero_sei = numero_sei;
    }

    public List<Interessados> getInteressados() {
        return interessados;
    }

    public void setInteressados(List<Interessados> interessados) {
        this.interessados = interessados;
    }

    public String getNumero_sei() {
        return numero_sei;
    }

    public void setNumero_sei(String numero_sei) {
        this.numero_sei = numero_sei;
    }

}
