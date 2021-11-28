package org.microsoft.outlook.controller;


import java.util.List;
 
import org.microsoft.outlook.model.Texto;
import org.microsoft.outlook.repository.TextoRepository;
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
@RequestMapping("/textos")
@CrossOrigin("*")
public class TextoController {
 
        @Autowired
        private TextoRepository repository;
       
        @GetMapping
        public ResponseEntity<List<Texto>> GetAll(){
                return ResponseEntity.ok(repository.findAll());
        }
       
        @GetMapping("/{id}")
        public ResponseEntity<Texto> GetById(@PathVariable long id){
                return repository.findById(id)
                                .map(resp -> ResponseEntity.ok(resp))
                                .orElse(ResponseEntity.notFound().build());            
        }
          
        @PostMapping
        public ResponseEntity<Texto> post (@RequestBody Texto postagem){
                return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
        }

        @PutMapping
        public ResponseEntity<Texto> put (@RequestBody Texto texto){
                return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(texto));
        }
       
        @DeleteMapping("/{id}")
        public void delete(@PathVariable long id) {
                repository.deleteById(id);
        }
        
}

