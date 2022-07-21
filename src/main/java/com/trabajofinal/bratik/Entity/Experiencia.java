
package com.trabajofinal.bratik.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExp;
    private String tituloExp;
    private String descripExp;

    public Experiencia() {
    }

    public Experiencia(String tituloExp, int fechaExp, String descripExp, String imagenExp) {
        this.tituloExp = tituloExp;
        this.descripExp = descripExp;
        }
     }
    

