package com.example.mongodb.service;

import java.util.List;

import com.example.mongodb.model.Agendamento;
import com.example.mongodb.model.Medico;

public interface MedicoService {

	public List<Medico> mostrarTodosMedicos();
	
	public Medico mostrarMedicoPorId(String cod);
	
	public Medico criarMedico(Medico medico);
}
