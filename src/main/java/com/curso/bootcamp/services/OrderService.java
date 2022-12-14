package com.curso.bootcamp.services;

import com.curso.bootcamp.entities.Order;
import com.curso.bootcamp.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();

    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);

        return obj.get();
    }
}
