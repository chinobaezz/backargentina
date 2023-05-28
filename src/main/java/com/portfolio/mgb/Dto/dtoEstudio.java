
package com.portfolio.mgb.Dto;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class dtoEstudio {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String titulo;
    
     @Temporal(TemporalType.DATE)
   private Date inicio;
     
      @Temporal(TemporalType.DATE)
   private Date fin;

    public dtoEstudio() {
    }

    public dtoEstudio(String titulo, Date inicio, Date fin) {
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    
}
