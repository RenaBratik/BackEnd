
package com.trabajofinal.bratik.Repository;

import com.trabajofinal.bratik.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IeducacionRepository extends JpaRepository<Educacion,Long> {
    
}
