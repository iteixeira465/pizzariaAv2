package com.av2.Pizzaria.controller;

import com.av2.Pizzaria.entity.Order;
import com.av2.Pizzaria.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/orders")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class OrderService {

    private OrderRepository repository;


    @GetMapping
    public List<Order> listAll(){
        return repository.findAll();
    }

    @GetMapping("{id")
        public Order findById(@PathVariable Long id){
         Optional<Order> optionalOrder = Optional.ofNullable(findById(id));
        return optionalOrder.get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order createOrder( @RequestBody Order order){
        return repository.save(order);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)  {
        repository.deleteById(id);
    }

}
