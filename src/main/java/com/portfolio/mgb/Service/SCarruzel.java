/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Dto.dtoCarruzel;
import com.portfolio.mgb.Repository.RCarruzel;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class SCarruzel {
      @Autowired
    public RCarruzel carruRepo;
    
    public List<dtoCarruzel> verdtoCarruzel() {
        List<dtoCarruzel> listadtoCarruzel= carruRepo.findAll();
        return listadtoCarruzel;
    }

    public dtoCarruzel buscardtoCarruzel(int id) {
          dtoCarruzel carru = carruRepo.findById(id).orElse(null);
        return carru;
    }

    public void creardtoCarruzel(dtoCarruzel pers) {
     carruRepo.save(pers);
    }
    

     public void borrardtoCarruzel(int id){
        carruRepo.deleteById(id);
    }

    public void editardtoCarruzel(dtoCarruzel pers) {
      carruRepo.save(pers);
    }

    public void deleteEstud(long id) {
        }
   
}
