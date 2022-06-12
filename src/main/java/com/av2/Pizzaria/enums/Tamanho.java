package com.av2.Pizzaria.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Tamanho {

    GRANDE("Grande"),
    MEDIA   ("Média"),
    PEQUENA ("Pequena");


    private final String description;

}
