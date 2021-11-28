package org.microsoft.outlook.controller;


import java.util.List;

import org.microsoft.outlook.model.Topico;
import org.microsoft.outlook.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/topico")
public class TopicoController {

       @Autowired
       private TopicoRepository repository;
      
       @GetMapping
       public ResponseEntity<List<Topico>> getAll(){
               return ResponseEntity.ok(repository.findAll());
       }
      
       @GetMapping("/{id}")
       public ResponseEntity<Topico> getById(@PathVariable long id){
               return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
                               .orElse(ResponseEntity.notFound().build());
       }
      
       @GetMapping("/nome/{nome}")
       public ResponseEntity<List<Topico>> getByName(@PathVariable String nome){
               return ResponseEntity.ok(repository.findAllByTopicoContainingIgnoreCase(nome));
       }
      
       @PostMapping
       public ResponseEntity<Topico> post (@RequestBody Topico topico){
               return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(topico));
       }
      
       @PutMapping
       public ResponseEntity<Topico> put (@RequestBody Topico topico){
               return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(topico));
       }
      
       @DeleteMapping("/{id}")
       public void delete(@PathVariable long id) {
               repository.deleteById(id);
       }
              
}
