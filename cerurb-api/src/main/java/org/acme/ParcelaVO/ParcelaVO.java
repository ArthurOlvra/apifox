package org.acme.ParcelaVO;

import java.math.BigDecimal;
import java.util.List;

import org.acme.AreaInteresse.AreaInteresse;
import org.acme.CertificacaoSigef.CertificacaoSigef;
import org.acme.Cidade.Cidade;
import org.acme.DocumentoRemessa.DocumentoRemessa;
import org.acme.Endereco.EnderecoVO;
import org.acme.MatriculaAnterior.MatriculaAnterior;
import org.acme.MatriculaAnteriorVO.MatriculaAnteriorVO;
import org.acme.ServicoCartorio.ServicoCartorio;
import org.acme.TituloInterpi.TituloInterpi;

public class ParcelaVO {
 
    private Long id;

    private String identificacao;

    private String numero_parcela;

    private BigDecimal area_total_ha;

    private String categoria;

    private String numero_itr;

    // Fazer VO
    private Cidade municipio;

    private AreaInteresse area_interesse;

    private MatriculaAnterior matricula;

    private MatriculaAnteriorVO matricula_anterior;

    private CertificacaoSigef certificacao_sigef;

    private TituloInterpi titulo;

    private List<ServicoCartorio> servicoscartorio_parcela;

    private BigDecimal perimetro;

    private EnderecoVO endereco;
    
    private List<DocumentoRemessa> documentos;

    public ParcelaVO() {
    }

    public ParcelaVO(Long id, String identificacao, String numero_parcela, BigDecimal area_total_ha, String categoria,
            String numero_itr, Cidade municipio, AreaInteresse area_interesse, MatriculaAnterior matricula,
            MatriculaAnteriorVO matricula_anterior, CertificacaoSigef certificacao_sigef, TituloInterpi titulo,
            List<ServicoCartorio> servicoscartorio_parcela, BigDecimal perimetro, EnderecoVO endereco,
            List<DocumentoRemessa> documentos) {
        this.id = id;
        this.identificacao = identificacao;
        this.numero_parcela = numero_parcela;
        this.area_total_ha = area_total_ha;
        this.categoria = categoria;
        this.numero_itr = numero_itr;
        this.municipio = municipio;
        this.area_interesse = area_interesse;
        this.matricula = matricula;
        this.matricula_anterior = matricula_anterior;
        this.certificacao_sigef = certificacao_sigef;
        this.titulo = titulo;
        this.servicoscartorio_parcela = servicoscartorio_parcela;
        this.perimetro = perimetro;
        this.endereco = endereco;
        this.documentos = documentos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getNumero_parcela() {
        return numero_parcela;
    }

    public void setNumero_parcela(String numero_parcela) {
        this.numero_parcela = numero_parcela;
    }

    public BigDecimal getArea_total_ha() {
        return area_total_ha;
    }

    public void setArea_total_ha(BigDecimal area_total_ha) {
        this.area_total_ha = area_total_ha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumero_itr() {
        return numero_itr;
    }

    public void setNumero_itr(String numero_itr) {
        this.numero_itr = numero_itr;
    }

    public Cidade getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Cidade municipio) {
        this.municipio = municipio;
    }

    public AreaInteresse getArea_interesse() {
        return area_interesse;
    }

    public void setArea_interesse(AreaInteresse area_interesse) {
        this.area_interesse = area_interesse;
    }

    public MatriculaAnterior getMatricula() {
        return matricula;
    }

    public void setMatricula(MatriculaAnterior matricula) {
        this.matricula = matricula;
    }

    public MatriculaAnteriorVO getMatricula_anterior() {
        return matricula_anterior;
    }

    public void setMatricula_anterior(MatriculaAnteriorVO matricula_anterior) {
        this.matricula_anterior = matricula_anterior;
    }

    public CertificacaoSigef getCertificacao_sigef() {
        return certificacao_sigef;
    }

    public void setCertificacao_sigef(CertificacaoSigef certificacao_sigef) {
        this.certificacao_sigef = certificacao_sigef;
    }

    public TituloInterpi getTitulo() {
        return titulo;
    }

    public void setTitulo(TituloInterpi titulo) {
        this.titulo = titulo;
    }

    public List<ServicoCartorio> getServicoscartorio_parcela() {
        return servicoscartorio_parcela;
    }

    public void setServicoscartorio_parcela(List<ServicoCartorio> servicoscartorio_parcela) {
        this.servicoscartorio_parcela = servicoscartorio_parcela;
    }

    public BigDecimal getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(BigDecimal perimetro) {
        this.perimetro = perimetro;
    }

    public EnderecoVO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoVO endereco) {
        this.endereco = endereco;
    }

    public List<DocumentoRemessa> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<DocumentoRemessa> documentos) {
        this.documentos = documentos;
    }


}
