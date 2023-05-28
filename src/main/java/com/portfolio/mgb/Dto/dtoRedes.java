/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


 @Entity
public class dtoRedes {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreRed;
    private String classe;

    public dtoRedes() {
    }

    public dtoRedes(String nombreRed, String classe) {
        this.nombreRed = nombreRed;
        this.classe = classe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRed() {
        return nombreRed;
    }

    public void setNombreRed(String nombreRed) {
        this.nombreRed = nombreRed;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
     
}
