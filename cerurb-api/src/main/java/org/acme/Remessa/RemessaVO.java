package org.acme.Remessa;

import java.util.Date;
import java.util.List;

import org.acme.ParcelaVO.ParcelaVO;
import org.acme.ProprietarioAtual.ProprietarioAtual;
import org.acme.Requerente.Requerente;

public class RemessaVO {
    
    private String numero_remessa;

    private String data_remessa;

    private String status;

    private String cns;

    private String nome_cartorio;

    private ProprietarioAtual proprietario_atual;

    private Requerente requerente;

    private List<ParcelaVO> parcelas;

    private Date dataImportacao;

    public RemessaVO() {
    }

    public RemessaVO(String numero_remessa, String data_remessa, String status, String cns, String nome_cartorio,
            ProprietarioAtual proprietario_atual, Requerente requerente, List<ParcelaVO> parcelas,
            Date dataImportacao) {
        this.numero_remessa = numero_remessa;
        this.data_remessa = data_remessa;
        this.status = status;
        this.cns = cns;
        this.nome_cartorio = nome_cartorio;
        this.proprietario_atual = proprietario_atual;
        this.requerente = requerente;
        this.parcelas = parcelas;
        this.dataImportacao = dataImportacao;
    }

    public String getNumero_remessa() {
        return numero_remessa;
    }

    public void setNumero_remessa(String numero_remessa) {
        this.numero_remessa = numero_remessa;
    }

    public String getData_remessa() {
        return data_remessa;
    }

    public void setData_remessa(String data_remessa) {
        this.data_remessa = data_remessa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getNome_cartorio() {
        return nome_cartorio;
    }

    public void setNome_cartorio(String nome_cartorio) {
        this.nome_cartorio = nome_cartorio;
    }

    public ProprietarioAtual getProprietario_atual() {
        return proprietario_atual;
    }

    public void setProprietario_atual(ProprietarioAtual proprietario_atual) {
        this.proprietario_atual = proprietario_atual;
    }

    public Requerente getRequerente() {
        return requerente;
    }

    public void setRequerente(Requerente requerente) {
        this.requerente = requerente;
    }

    public List<ParcelaVO> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<ParcelaVO> parcelas) {
        this.parcelas = parcelas;
    }

    public Date getDataImportacao() {
        return dataImportacao;
    }

    public void setDataImportacao(Date dataImportacao) {
        this.dataImportacao = dataImportacao;
    }

}
