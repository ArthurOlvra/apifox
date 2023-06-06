package org.acme.ServicoCartorio;

import org.acme.ProcessoImovel.ProcessoImovel;
import org.acme.TipoServico.TipoServico;

public class ServicoCartorio {
    
    private TipoServico tipoServico;

    private ProcessoImovel processo_imovel;

    public ServicoCartorio() {
    }

    public ServicoCartorio(TipoServico tipoServico, ProcessoImovel processo_imovel) {
        this.tipoServico = tipoServico;
        this.processo_imovel = processo_imovel;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public ProcessoImovel getProcesso_imovel() {
        return processo_imovel;
    }

    public void setProcesso_imovel(ProcessoImovel processo_imovel) {
        this.processo_imovel = processo_imovel;
    }
    
}
