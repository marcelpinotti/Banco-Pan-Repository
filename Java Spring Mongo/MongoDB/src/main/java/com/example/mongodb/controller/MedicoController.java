package com.example.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.model.Medico;
import com.example.mongodb.service.MedicoService;

@RestController
@RequestMapping(path = "/medicos")
public class MedicoController {

	@Autowired
	private MedicoService medicoService;

	@GetMapping
	public List<Medico> mostrarTodosMedicos() {
		return this.medicoService.mostrarTodosMedicos();
}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Medico> mostraMedicoPorId(@PathVariable String id) {
		Medico obj = this.medicoService.mostrarMedicoPorId(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Medico criarmedico(@RequestBody Medico medico) {
		return this.medicoService.criarMedico(medico);
	}
	
}
