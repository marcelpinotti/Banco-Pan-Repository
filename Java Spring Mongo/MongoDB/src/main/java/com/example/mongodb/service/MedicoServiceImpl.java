package com.example.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodb.model.Agendamento;
import com.example.mongodb.model.Medico;
import com.example.mongodb.repository.AgendamentoRepository;
import com.example.mongodb.repository.MedicoRepository;

@Service
public class MedicoServiceImpl implements MedicoService {
	
	@Autowired
	MedicoRepository medicoRepository;
	
	@Override
	public List<Medico> mostrarTodosMedicos(){
		return this.medicoRepository.findAll();
	}
	
	@Override
	public Medico mostrarMedicoPorId(String cod) {
		return this.medicoRepository
				.findById(cod)
				.orElseThrow(() -> new IllegalArgumentException("Médico inexistente!"));
	}
	
	@Override
	public Medico criarMedico(Medico medico) {
		return this.medicoRepository.save(medico);
	}
	
	

}
