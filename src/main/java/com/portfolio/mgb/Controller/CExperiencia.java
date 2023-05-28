/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.Controller;

import com.portfolio.mgb.Dto.dtoExperiencia;
import com.portfolio.mgb.Service.SExperiencia;
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
@RequestMapping("ecperiencia")
@CrossOrigin(origins = {"https://chino-frontend.web.app","http://localhost:4200"})
public class CExperiencia {
   
    
      @Autowired
   private SExperiencia expeServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <dtoExperiencia> verdtoExperiencia(){
        return expeServ.verdtoExperiencia();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public dtoExperiencia verdtoExperiencia(@PathVariable int id){
        return expeServ.buscardtoExperiencia(id);
    }
    
    @PostMapping("/create")
    public String agregardtoExperiencia (@RequestBody dtoExperiencia pers){
        expeServ.creardtoExperiencia(pers);
        return "la experiencia fue creada correctamente";
    }
    
   
   
    @DeleteMapping("/delete/{id}")
    public void borrardtoExperiencia(@PathVariable long id){
        expeServ.borrardtoExperiencia((int) id);
    }
    @PutMapping("/editar")
    public void updatedtoExperiencia(@RequestBody dtoExperiencia pers){
        expeServ.editardtoExperiencia(pers);
        
    }
}
