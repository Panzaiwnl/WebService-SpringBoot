package com.curso.bootcamp.repositories;

import com.curso.bootcamp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
