package com.classes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classes.repository.ProductRepository;
import com.classes.table.Products;

import java.util.List;

@RestController
@CrossOrigin("*")
public class Controller {
    @GetMapping("retornoString")
    public String method(){
        return "hello";
    }

    @GetMapping("/retornoNumero")
    public int idade(){
        return 1;
    }

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/manutencoes")
    public List<Products> getAll() {
        return productRepository.findAll();
    }
}