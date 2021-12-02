package com.example.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.model.Agendamento;

public interface AgendamentoRepository extends MongoRepository<Agendamento, String> {
	
}
