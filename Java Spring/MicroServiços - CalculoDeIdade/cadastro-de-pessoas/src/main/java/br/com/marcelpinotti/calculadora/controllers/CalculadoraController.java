package br.com.marcelpinotti.calculadora.controllers;

import br.com.marcelpinotti.calculadora.models.CalculadoraIdade;
import br.com.marcelpinotti.calculadora.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@RestController
@RequestMapping(value = "/idade")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping(value = "/calculo/{id}")
    public ResponseEntity<CalculadoraIdade> getIdade(@PathVariable Long PessoaId);
            CalculadoraIdade idade = calculadoraService.getCalculo(PessoaId, atual);
            return ResponseEntity.ok(idade);
        }
    }
}
