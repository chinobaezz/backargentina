/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Dto.dtoHabilidades;
import com.portfolio.mgb.Repository.RHabilidades;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SHabilidades {
 @Autowired
    public RHabilidades habiRepo;
     
      public List<dtoHabilidades> verdtoHabilidades(){
        List<dtoHabilidades> listadtoHabilidades= habiRepo.findAll();
        return listadtoHabilidades;
    }
    
      public dtoHabilidades buscardtoHabilidades(int id){
        dtoHabilidades habi = habiRepo.findById(id).orElse(null);
        return habi;
    }
    
    public void creardtoHabilidades(dtoHabilidades habi){
        habiRepo.save(habi);
    }
    
    
    
     public void editardtoHabilidades(dtoHabilidades habi){
        habiRepo.save(habi);
    }

    public void borrardtoHabilidades(int id) {
    habiRepo.deleteById(id);
    }

    public void editardtoHablidades(dtoHabilidades hab) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

       
}
