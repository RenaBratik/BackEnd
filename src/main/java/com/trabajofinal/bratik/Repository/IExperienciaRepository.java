
package com.trabajofinal.bratik.Repository;

import com.trabajofinal.bratik.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findBytituloExp(String tituloExp);
    public boolean existsBytituloExp(String tituloExp);
}
