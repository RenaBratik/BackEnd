
package com.trabajofinal.bratik.Repository;

import com.trabajofinal.bratik.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia,Long>{
    
}
