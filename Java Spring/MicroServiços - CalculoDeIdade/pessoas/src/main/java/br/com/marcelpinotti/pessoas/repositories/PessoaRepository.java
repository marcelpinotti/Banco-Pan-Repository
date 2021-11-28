package br.com.marcelpinotti.pessoas.repositories;

import br.com.marcelpinotti.pessoas.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
}
