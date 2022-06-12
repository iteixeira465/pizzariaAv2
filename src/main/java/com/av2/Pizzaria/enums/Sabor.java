package com.av2.Pizzaria.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Sabor {

    MARGERITA("Grande"),
    FRANGO   ("Média"),
    CALABRESA ("Pequena"),
    QUEIJO ("Queijo"),
    PORTUGUESA ("Portuguesa");

    private final String description;
}
