
package com.trabajofinal.bratik.Controller;

import com.trabajofinal.bratik.Entity.Experiencia;
import com.trabajofinal.bratik.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping("experiencias/traer")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    
    @PostMapping("/experiencias/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
        return "Experiencia creada correctamente";
    }
    
    @DeleteMapping("/experiencias/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
        return "Experiencia eliminada correctamente";
    }
    
    @PutMapping("/experiencias/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                                @RequestParam("tituloExp")String NuevaExperiencia,
                                @RequestParam("fechaExp")int NuevaFechaExperiencia,
                                @RequestParam("descripExp")String NuevaDescripcionExperiencia,
                                @RequestParam("imgenExp")String NuevaImagenExperiencia){
        Experiencia experiencia = iexperienciaService.findExperiencia(id);
        
        experiencia.setTituloExp(NuevaExperiencia);
        experiencia.setFechaExp(NuevaFechaExperiencia);
        experiencia.setDescripExp(NuevaExperiencia);
        experiencia.setImagenExp(NuevaImagenExperiencia);
             
        iexperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }
}