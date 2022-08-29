package com.curso.bootcamp.resources;

import com.curso.bootcamp.entities.Category;
import com.curso.bootcamp.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping
    public ResponseEntity<Category> findById(Long id){
        Category list = service.findById(id);

        return ResponseEntity.ok().body(list);

    }

}
