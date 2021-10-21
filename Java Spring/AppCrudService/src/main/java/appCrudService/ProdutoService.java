package appCrudService;

import java.util.Collection;

public interface ProdutoService {

    public void createProduto(Produto produt0);
    public void deleteProduto(String id);
    public Collection<Produto> getProdutos();

}
