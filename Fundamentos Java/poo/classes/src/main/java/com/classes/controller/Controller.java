package com.classes.controller;

import com.classes.repository.Repository;
import com.classes.tabelas.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")// Autoriza qualquer site a fazer a transição
public class Controller {

    @Autowired
    private Repository repository;

    @GetMapping("/produtos")
    public List<Produtos> buscarTodos(){
        return repository.findAll();
    }



}
