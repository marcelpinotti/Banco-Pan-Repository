package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {

	@Query(value= "SELECT * FROM CLIENTE_MODEL u WHERE u.tipo = :tipo", nativeQuery = true)
	List<ClienteModel> procuraTipoPessoa(Integer tipo);

	@Query(value = "SELECT * FROM CLIENTE_MODEL c", nativeQuery = true)
	List<ClienteModel> procuraTodos();

	@Query(value= "SELECT * FROM CLIENTE_MODEL c ORDER BY c.nome", nativeQuery = true)
	List<ClienteModel> procuraTodosAlfabetico();

}
