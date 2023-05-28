/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Dto.dtoExperiencia;
import com.portfolio.mgb.Entity.Experiencia;
import com.portfolio.mgb.Repository.RExperiencia;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
     @Autowired
    public RExperiencia ecpeRepo;
    
    public List<dtoExperiencia> verdtoExperiencia(){
        List<dtoExperiencia> listadtoExperiencia= ecpeRepo.findAll();
        return listadtoExperiencia;
    }
    
      public dtoExperiencia buscardtoExperiencia(int id){
        dtoExperiencia ecpe = ecpeRepo.findById(id).orElse(null);
        return ecpe;
    }
      //donde dice persona poner ecperiencia donde dice perso poner ecpe aaAfgbbn
    public void creardtoExperiencia(dtoExperiencia ecpe){
        ecpeRepo.save(ecpe);
    }
    
    
    
     public void editardtoExperiencia(dtoExperiencia ecpe){
        ecpeRepo.save(ecpe);
    }

    public void borrardtoExperiencia(int id) {
    ecpeRepo.deleteById(id);
    }
     
}
