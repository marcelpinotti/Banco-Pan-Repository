package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.TarefasModel;

public interface TarefasRepository extends JpaRepository<TarefasModel, Long> {
	
	public List<TarefasModel> findAllByTarefaContainingIgnoreCase(String tarefa);

	public List<TarefasModel> findByTarefaAndId(String tarefa, Long id);
	
	@Query(value = "SELECT * FROM TAFERA_MODEL",
			nativeQuery = true)
	List<TarefasModel> procuraTodos();
}
