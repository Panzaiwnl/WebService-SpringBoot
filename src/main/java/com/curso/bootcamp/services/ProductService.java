package com.curso.bootcamp.services;

import com.curso.bootcamp.entities.Product;
import com.curso.bootcamp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    public List<Product> findAll(){
        List<Product> list = repository.findAll();

        return list;

    }

    public Product findById(Long id){
        Optional<Product> list = repository.findById(id);

        return list.get();
    }

}
