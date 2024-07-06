
package com.milagrosa.inventario.logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Lotes implements Serializable {
    
    @Id
    private Integer nLote;
    private Float monto;
    private String fecha;

    public Lotes() {
    }

    public Lotes(Integer nLote, Float monto, String fecha) {
        this.nLote = nLote;
        this.monto = monto;
        this.fecha = fecha;
    }

    public Integer getnLote() {
        return nLote;
    }

    public void setnLote(Integer nLote) {
        this.nLote = nLote;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
