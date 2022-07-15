package com.trabajofinal.bratik.Entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    
   @NotNull
   @Size(min = 1, max = 50, message = "longitud incorrecta")
   private String nombre;
   
  @NotNull
  @Size(min = 1, max = 50, message = "longitud incorrecta") 
  private String apellido;
  
   @Size(min = 1, max = 50, message = "longitud incorrecta")
   private String img;
   
   @OneToMany (fetch = FetchType.LAZY, mappedBy = "idEdu")
   private List<Educacion> educacionList;
   @OneToMany (fetch = FetchType.LAZY, mappedBy = "idExp")
   private List<Experiencia> experienciaList;
   @OneToMany (fetch = FetchType.LAZY, mappedBy = "idSkill")
   private List<Skills> skillList;
}

