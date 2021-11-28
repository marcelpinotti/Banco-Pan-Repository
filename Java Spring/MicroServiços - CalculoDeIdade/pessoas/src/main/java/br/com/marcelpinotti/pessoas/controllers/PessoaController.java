package br.com.marcelpinotti.pessoas.controllers;


import br.com.marcelpinotti.pessoas.models.PessoaModel;
import br.com.marcelpinotti.pessoas.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping(value = "/todos")
    public ResponseEntity<List<PessoaModel>> findAll(){
        return ResponseEntity.ok(pessoaRepository.findAll());
    }

    @GetMapping(value ="/todos/{id}")
    public ResponseEntity<PessoaModel> findById(@PathVariable Long id){
        return ResponseEntity.ok(pessoaRepository.findById(id).get());
    }

}
