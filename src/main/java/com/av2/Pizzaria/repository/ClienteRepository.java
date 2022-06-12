package com.av2.Pizzaria.repository;

import com.av2.Pizzaria.entity.Cliente;
import com.av2.Pizzaria.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
