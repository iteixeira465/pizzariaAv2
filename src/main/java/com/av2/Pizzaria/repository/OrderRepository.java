package com.av2.Pizzaria.repository;

import com.av2.Pizzaria.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
