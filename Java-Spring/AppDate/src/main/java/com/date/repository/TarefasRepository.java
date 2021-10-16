package com.date.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.date.model.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {

}
