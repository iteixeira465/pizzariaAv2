package com.av2.Pizzaria.entity;

import com.av2.Pizzaria.enums.Sabor;
import com.av2.Pizzaria.enums.Tamanho;

import javax.persistence.*;
import java.util.InputMismatchException;
import java.util.List;

@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "cliente_id", unique=true)
    private Cliente cliente;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;


    @ElementCollection(fetch = FetchType.LAZY, targetClass = Sabor.class)
    @Enumerated(EnumType.STRING)
    @Column(name = "sabor", length = 30)
    @JoinTable(name = "tb_sabor")
    private List<Sabor> saborList;

    public Order() {
    }

    public Order(Long id, Cliente cliente, Tamanho tamanho) {
        this.id = id;
        this.cliente = cliente;
        this.tamanho = tamanho;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public List<Sabor> getSaborList() {
        return saborList;
    }

    public void addSabor(Sabor sabor) {
        if (getTamanho().equals(Tamanho.PEQUENA) && getSaborList().size() >=1){
            throw new InputMismatchException("");
        } else if (getTamanho().equals(Tamanho.MEDIA) && getSaborList().size() >=2) {

        } else if (getTamanho().equals(Tamanho.GRANDE) && getSaborList().size() >=3) {

        }
        this.saborList.add(sabor);
    }

    public void delSabor(Sabor sabor) {
        this.saborList.remove(sabor);
    }
}
