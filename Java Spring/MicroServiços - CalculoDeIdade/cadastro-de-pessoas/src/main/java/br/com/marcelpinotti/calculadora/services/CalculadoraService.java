package br.com.marcelpinotti.calculadora.services;

import br.com.marcelpinotti.calculadora.models.CalculadoraIdade;
import br.com.marcelpinotti.calculadora.models.PessoaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class CalculadoraService {


    @Value("${microsservicopessoas.host}")
    private String mSevicoPessoa;

    @Autowired
    private RestTemplate restTemplate;

    public CalculadoraIdade getCalculo(long PessoaId) {
        Map<String, String> urlParametros = new HashMap<>();

        urlParametros.put("id", "" + PessoaId);

        PessoaModel pessoaModel = restTemplate.getForObject(mSevicoPessoa + "/pessoa/todos/{id}", PessoaModel.class, urlParametros);
        Date atual = new Date();
        long idade = ChronoUnit.YEARS.between(pessoaModel.getNascimento(), atual);
        return new CalculadoraIdade(pessoaModel.getNome(), pessoaModel.getNascimento(), dias);

    }
}
