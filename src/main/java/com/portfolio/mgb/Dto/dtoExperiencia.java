
package com.portfolio.mgb.Dto;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class dtoExperiencia {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombreEmpresa;
    
    private String puesto;
    
    @Temporal(TemporalType.DATE)
   private Date inicio;
    @Temporal(TemporalType.DATE)
   private Date fin;
  
    @Lob
   private String imagen;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreEmpresa, String puesto, Date inicio, Date fin, String imagen) {
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
