/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Controller;

import com.portfolio.mgb.Dto.dtoHabilidades;
import com.portfolio.mgb.Service.SHabilidades;
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
@RequestMapping("habilidades")
//@CrossOrigin("*")
@CrossOrigin(origins= "https://chino-frontend.web.app")
public class CHabilidades {
   
    @Autowired
   private SHabilidades habServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <dtoHabilidades> verdtoHabilidades(){
        return habServ.verdtoHabilidades();
    }
     @GetMapping("/ver/{id}")
    @ResponseBody
    public dtoHabilidades verdtoHabilidades(@PathVariable int id){
        return habServ.buscardtoHabilidades(id);
    }
    
    @PostMapping("/create")
    public String agregardtoHabilidades (@RequestBody dtoHabilidades hab){
        habServ.creardtoHabilidades(hab);
        return "hablidad fue creada correctamente";
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrardtoHabilidades(@PathVariable long id){
        habServ.borrardtoHabilidades((int) id);
    }

    @PutMapping("/editar")
    public void updatedtoHabilidades(@RequestBody dtoHabilidades hab){
        habServ.editardtoHabilidades(hab);
        
    }
     
}
