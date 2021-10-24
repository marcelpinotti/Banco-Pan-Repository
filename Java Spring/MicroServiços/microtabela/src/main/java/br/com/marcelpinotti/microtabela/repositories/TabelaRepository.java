package br.com.marcelpinotti.microtabela.repositories;

import br.com.marcelpinotti.microtabela.model.Tabela;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TabelaRepository extends JpaRepository<Tabela, Long> {

}
