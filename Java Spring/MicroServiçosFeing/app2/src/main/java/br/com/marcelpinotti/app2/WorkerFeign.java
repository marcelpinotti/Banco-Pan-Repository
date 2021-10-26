package br.com.marcelpinotti.app2;


import java.util.List;

import br.com.marcelpinotti.app2.model.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "servidorzinho", url="localhost:8081", path="/usuarios")
public interface WorkerFeign {

    @GetMapping
    public ResponseEntity<List<Usuario>> getAll();

}

