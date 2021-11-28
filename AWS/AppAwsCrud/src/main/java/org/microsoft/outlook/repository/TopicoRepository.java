package org.microsoft.outlook.repository;

import java.util.List;

import org.microsoft.outlook.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {
	public List<Topico> findAllByTopicoContainingIgnoreCase(String titulo);

}
