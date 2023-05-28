/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Controller;

import com.portfolio.mgb.Dto.dtoEstudio;
import com.portfolio.mgb.Service.SEstudio;
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
@RequestMapping("estudio")
//@CrossOrigin("*")
@CrossOrigin(origins= "https://chino-frontend.web.app")
public class CEstudio {
       
     @Autowired
  SEstudio estudServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <dtoEstudio> verdtoEstudio(){
        return estudServ.verdtoEstudio();
    }
    
    @GetMapping("/lista/saludar")
    public String saludar(){
        return "bienvenido Arg";
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public dtoEstudio verdtoEstudio(@PathVariable int id){
        return estudServ.buscardtoEstudio(id);
    }
    
    @PostMapping("/create")
    public String agregardtoEstudio (@RequestBody dtoEstudio estud){
        estudServ.creardtoEstudio(estud);
        return "la estudio fue creada correctamente";
    }

  
    
    @DeleteMapping("/delete/{id}")
    public void borrardtoEstudio(@PathVariable long id){
        estudServ.borrardtoEstudio((int) id);
    }

    @PutMapping("/editar")
    public void updatedtoEstudio(@RequestBody dtoEstudio pers){
        estudServ.editardtoEstudio(pers);
        
    }
    
}
