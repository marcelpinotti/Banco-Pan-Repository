package com.example.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.model.Medico;

public interface MedicoRepository extends MongoRepository<Medico, String> {

}
