package br.com.marcelpinotti.microtabela.resources;

import br.com.marcelpinotti.microtabela.model.Tabela;
import br.com.marcelpinotti.microtabela.repositories.TabelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/tabela")
public class TabelaResource {

    @Autowired
    private TabelaRepository tabelaRepository;

    @GetMapping
    public ResponseEntity<List<Tabela>> findAll(){
        List<Tabela> list = tabelaRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Tabela> findById(@PathVariable Long id){
        Tabela obj= tabelaRepository.findById(id).get();
        return ResponseEntity.ok(obj);
    }
}
