package br.com.marcelpinotti.estudandojpa.repositorys;

import br.com.marcelpinotti.estudandojpa.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    public List<Pessoa> findByNomeAndId(String nome, Long id);

    public List<Pessoa> findByNomeOrId(String nome, Long id);
}
