package br.com.marcelpinotti.estudandojpa.controllers;

import br.com.marcelpinotti.estudandojpa.models.Pessoa;
import br.com.marcelpinotti.estudandojpa.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/jpa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping(value = "/todos")
    public ResponseEntity<List<Pessoa>> buscarTodos(){
        //return pessoaRepository.findAll());
        //return ResponseEntity.ok(pessoaRepository.findAll());
        return ResponseEntity.status(HttpStatus.OK).body(pessoaRepository.findAll());
    }

    @GetMapping(value = "/pessoa/{id}")
    public ResponseEntity<Pessoa> buscarPorId(@PathVariable Long id){
        return pessoaRepository.findById(id)
                .map(x -> ResponseEntity.ok(x))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(value = "/pessoa/{nome}/{id}")
    public ResponseEntity<List<Pessoa>> nomeAndId(@PathVariable String nome, @PathVariable Long id){
        //return ResponseEntity.status(HttpStatus.OK).body(pessoaRepository.findByNomeAndId(nome, id));
        return ResponseEntity.ok(pessoaRepository.findByNomeAndId(nome, id));
    }

    @GetMapping(value = "/pessoa/um_parametro/{nome}/{id}")
    public ResponseEntity<List<Pessoa>> nomeOrId(@PathVariable String nome, @PathVariable Long id){
        //return ResponseEntity.status(HttpStatus.OK).body(pessoaRepository.findByNomeOrId(nome, id));
        return ResponseEntity.ok(pessoaRepository.findByNomeOrId(nome, id));
    }

    @PostMapping(value = "/salvar")
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa){
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaRepository.save(pessoa));
    }
}
