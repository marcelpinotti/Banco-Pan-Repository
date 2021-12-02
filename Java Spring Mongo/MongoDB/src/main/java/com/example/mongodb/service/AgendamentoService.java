package com.example.mongodb.service;

import java.util.List;

import com.example.mongodb.model.Agendamento;

public interface AgendamentoService {
	
	public List<Agendamento> mostrarTodosAgendamentos();
	
	public Agendamento mostrarAgendamentoPorId(String cod);
	
	public Agendamento criarAgendamento(Agendamento agendamento);

}
