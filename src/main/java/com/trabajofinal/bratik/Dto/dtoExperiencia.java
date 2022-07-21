
package com.trabajofinal.bratik.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoExperiencia {
    @NotBlank
    private String tituloExp;
    @NotBlank
    private String descripExp;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String tituloExp, String descripExp) {
        this.tituloExp = tituloExp;
        this.descripExp = descripExp;
    }
    }
