
package com.trabajofinal.bratik.Service;

import com.trabajofinal.bratik.Entity.Experiencia;
import com.trabajofinal.bratik.Repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpExperienciaService {
    @Autowired IExperienciaRepository iexperienciaRepository;
                     
     public List<Experiencia> list(){
       return iexperienciaRepository.findAll();
     }
     public Optional <Experiencia> getOne (int id){
       return iexperienciaRepository.findById(id);
     }
     public Optional <Experiencia> getBytituloExp (String tituloExp){
       return iexperienciaRepository.findBytituloExp (tituloExp);
     }
     public void save(Experiencia experiencia){
     iexperienciaRepository.save(experiencia);
     }
     public void delete(int id){
         iexperienciaRepository.deleteById(id);
     }
     public boolean existsById(int id){
         return iexperienciaRepository.existsById(id);
     }
     public boolean existsBytituloExp(String tituloExp){
         return iexperienciaRepository.existsBytituloExp(tituloExp);
     }
    
 }
