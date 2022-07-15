
package com.trabajofinal.bratik.Controller;

import com.trabajofinal.bratik.Entity.Educacion;
import com.trabajofinal.bratik.Interface.IeducacionService;
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
public class educacionController {
    @Autowired IeducacionService ieducacionService;
    
    @GetMapping("educaciones/traer")
    public List<Educacion> getPersona(){
        return ieducacionService.geteducacion();
    }
    
    @PostMapping("/educaciones/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        ieducacionService.saveeducacion(educacion);
        return "Educacion fue creada correctamente";
    }
    
    @DeleteMapping("/educaciones/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id){
        ieducacionService.deleteeducacion(id);
        return "Educacion fue eliminada correctamente";
    }
    
    @PutMapping("/educaciones/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                                @RequestParam("tituloEdu")String NuevoTitulo,
                                @RequestParam("fechaEdu")int NuevaFechaEducacion,
                                @RequestParam("descripEdu")String NuevaDescripcionEducacion,
                                @RequestParam("imagenEdu")String NuevaImagenEducacion){
        Educacion educacion = ieducacionService.findeducacion(id);
        
        educacion.setTituloEdu(NuevoTitulo);
        educacion.setFechaEdu(NuevaFechaEducacion);
        educacion.setDescripEdu(NuevaDescripcionEducacion);
        educacion.setImagenEdu(NuevaImagenEducacion);
        
        ieducacionService.saveeducacion(educacion);
        return educacion;
    
}
}
