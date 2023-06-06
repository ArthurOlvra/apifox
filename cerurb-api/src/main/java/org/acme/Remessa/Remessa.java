package org.acme.Remessa;

import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Remessa extends PanacheEntity{

    private String cns;

    private String numeroRemessa;

    private String status;

    public Remessa() {
    }

    public Remessa(String cns, String numeroRemessa, String status) {
        this.cns = cns;
        this.numeroRemessa = numeroRemessa;
        this.status = status;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getNumeroRemessa() {
        return numeroRemessa;
    }

    public void setNumeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
    
   