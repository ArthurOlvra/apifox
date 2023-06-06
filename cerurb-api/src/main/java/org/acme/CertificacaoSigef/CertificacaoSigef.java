package org.acme.CertificacaoSigef;

public class CertificacaoSigef {
 
    private String perimetro_geo;
    private String memorial_descritivo_analitico;
    private String memorial_descritivo_pdf;
    private String planta_a4_pdf;
    private String sistema_geo;

    public CertificacaoSigef() {
    }

    public CertificacaoSigef(String perimetro_geo, String memorial_descritivo_analitico, String memorial_descritivo_pdf,
            String planta_a4_pdf, String sistema_geo) {
        this.perimetro_geo = perimetro_geo;
        this.memorial_descritivo_analitico = memorial_descritivo_analitico;
        this.memorial_descritivo_pdf = memorial_descritivo_pdf;
        this.planta_a4_pdf = planta_a4_pdf;
        this.sistema_geo = sistema_geo;
    }
    
    public String getPerimetro_geo() {
        return perimetro_geo;
    }
    public void setPerimetro_geo(String perimetro_geo) {
        this.perimetro_geo = perimetro_geo;
    }
    public String getMemorial_descritivo_analitico() {
        return memorial_descritivo_analitico;
    }
    public void setMemorial_descritivo_analitico(String memorial_descritivo_analitico) {
        this.memorial_descritivo_analitico = memorial_descritivo_analitico;
    }
    public String getMemorial_descritivo_pdf() {
        return memorial_descritivo_pdf;
    }
    public void setMemorial_descritivo_pdf(String memorial_descritivo_pdf) {
        this.memorial_descritivo_pdf = memorial_descritivo_pdf;
    }
    public String getPlanta_a4_pdf() {
        return planta_a4_pdf;
    }
    public void setPlanta_a4_pdf(String planta_a4_pdf) {
        this.planta_a4_pdf = planta_a4_pdf;
    }
    public String getSistema_geo() {
        return sistema_geo;
    }
    public void setSistema_geo(String sistema_geo) {
        this.sistema_geo = sistema_geo;
    }

}
