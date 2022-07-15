
package com.trabajofinal.bratik.Service;

import com.trabajofinal.bratik.Entity.Educacion;
import com.trabajofinal.bratik.Interface.IeducacionService;
import com.trabajofinal.bratik.Repository.IeducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpeducacionService implements IeducacionService{
    @Autowired IeducacionRepository ieducacionRepository;

    @Override
    public List<Educacion> geteducacion() {
        List<Educacion> educacion = ieducacionRepository.findAll();
       return educacion;
    }

    @Override
    public void saveeducacion(Educacion educacion) {
        ieducacionRepository.save(educacion);
    }

    @Override
    public void deleteeducacion(Long id) {
        ieducacionRepository.deleteById(id);
    }

    @Override
    public Educacion findeducacion(Long id) {
        Educacion educacion = ieducacionRepository.findById(id).orElse(null);
        return educacion;
    }
    }
