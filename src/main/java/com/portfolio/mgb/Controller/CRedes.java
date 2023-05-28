/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Controller;

import com.portfolio.mgb.Dto.dtoRedes;
import com.portfolio.mgb.Service.SRedes;
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
@RequestMapping("redes")
//@CrossOrigin("*")
@CrossOrigin(origins= "https://chino-frontend.web.app")
public class CRedes {
    
    @Autowired
   private SRedes redServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <dtoRedes> verdtoRedes(){
        return redServ.verdtoRedes();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public dtoRedes verdtoRedes(@PathVariable int id){
        return redServ.buscardtoRedes(id);
    }
    
    @PostMapping("/create")
    public String agregardtoRedes (@RequestBody dtoRedes pers){
        redServ.creardtoRedes(pers);
        return "la redna fue creada correctamente";
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrardtoRedes(@PathVariable long id){
        redServ.borrardtoRedes((int) id);
    }
    @PutMapping("/editar")
    public void updatedtoRedes(@RequestBody dtoRedes pers){
        redServ.editardtoRedes(pers);
        
    }
}
