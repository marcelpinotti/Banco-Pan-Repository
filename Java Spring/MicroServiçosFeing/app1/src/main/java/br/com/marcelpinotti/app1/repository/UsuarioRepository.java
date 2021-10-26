package br.com.marcelpinotti.app1.repository;

import br.com.marcelpinotti.app1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
