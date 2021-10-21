package appCrudService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping("/listar")
    public ResponseEntity<Object> getProduto() {
        return new ResponseEntity<>(produtoService.getProdutos(), HttpStatus.OK);
    }

    @DeleteMapping("/deletar")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        produtoService.deleteProduto(id);
        return new ResponseEntity<>("Prod Deletado!", HttpStatus.OK);
    }

    @PostMapping("/produtos")
    public ResponseEntity<Object> createProduto(@RequestBody Produto produto) {
        produtoService.createProduto(produto);
        return new ResponseEntity<>("Prod criado", HttpStatus.CREATED);
    }
}
