
package com.trabajofinal.bratik.Controller;

import com.trabajofinal.bratik.Dto.dtoExperiencia;
import com.trabajofinal.bratik.Entity.Experiencia;
import com.trabajofinal.bratik.Interface.IExperienciaService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("explab")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping
    public ResponseEntity<List<Experiencia>> list(){
       List<Experiencia> list = iexperienciaService.getExperiencia();
       return new ResponseEntity(list, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp){
        if(StringUtils.isBlank(dtoexp.getTituloExp()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(iexperienciaService.existsByTituloExp(dtoexp.getTituloExp()))
            return new ResponseEntity (new mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
    }

}