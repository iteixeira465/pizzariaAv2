package com.av2.Pizzaria.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer telefone;

    @Column(nullable = false)
    private String Rua;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private Integer endNumero;

    @OneToOne
    private Order order;



}
