/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Controller;

import com.portfolio.mgb.Dto.dtoCarruzel;
import com.portfolio.mgb.Service.SCarruzel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("carruzel")
//@CrossOrigin("*")
@CrossOrigin(origins= "https://chino-frontend.web.app")
public class CCarruzel {
    @Autowired
   private SCarruzel carruServ;
    @GetMapping("/lista")
    @ResponseBody
    public List <dtoCarruzel> verdtoCarruzel(){
        return carruServ.verdtoCarruzel();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public dtoCarruzel verdtoCarruzel(@PathVariable int id){
        return carruServ.buscardtoCarruzel(id);
    }
    
    @PostMapping("/create")
    public String agregardtoCarruzel (@RequestBody dtoCarruzel pers){
        carruServ.creardtoCarruzel(pers);
        return "la carruio fue creada correctamente";
    }

  
    
    @DeleteMapping("/delete/{id}")
    public void borrardtoCarruzel(@PathVariable long id){
        carruServ.borrardtoCarruzel((int) id);
    }

    @PutMapping("/editar")
    public void updatedtoCarruzel(@RequestBody dtoCarruzel pers){
        carruServ.editardtoCarruzel(pers);
        
    }   
}
