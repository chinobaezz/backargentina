/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Dto.dtoRedes;
import com.portfolio.mgb.Repository.RRedes;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SRedes {
    
    @Autowired
    public RRedes redRepo;
    public List<dtoRedes> verdtoRedes() {
        List<dtoRedes> listadtoRedes= redRepo.findAll();
        return listadtoRedes;
    }
    
    public dtoRedes buscardtoRedes(int id) {
          dtoRedes red = redRepo.findById(id).orElse(null);
        return red;
    }

    public void creardtoRedes(dtoRedes pers) {
     redRepo.save(pers);
    }
    

     public void borrardtoRedes(int id){
        redRepo.deleteById(id);
    }

    public void editardtoRedes(dtoRedes pers) {
      redRepo.save(pers);
    }

    public void deleteEstud(long id) {
        } 
    
    
}
