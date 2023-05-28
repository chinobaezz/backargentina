/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Dto.dtoEstudio;
import com.portfolio.mgb.Repository.REstudio;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author baeza
 */

@Service
@Transactional
public class SEstudio {
    
   
 @Autowired
  REstudio estuRepo;
 
    public List<dtoEstudio> verdtoEstudio() {
        List<dtoEstudio> listadtoEstudio= estuRepo.findAll();
        return listadtoEstudio;
    }

    public dtoEstudio buscardtoEstudio(int id) {
          dtoEstudio estu = estuRepo.findById(id).orElse(null);
        return estu;
    }

    public void creardtoEstudio(dtoEstudio estu) {
     estuRepo.save(estu);
    }
    

     public void borrardtoEstudio(int id){
        estuRepo.deleteById(id);
    }

    public void editardtoEstudio(dtoEstudio pers) {
      estuRepo.save(pers);
    }

    public void deletedtoEstud(long id) {
    }   
}
