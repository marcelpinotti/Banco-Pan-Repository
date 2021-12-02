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

import com.example.mongodb.model.Agendamento;
import com.example.mongodb.service.AgendamentoService;

@RestController
@RequestMapping(path = "/agendamentos")
public class AgendamentoController {
	
	@Autowired
	private AgendamentoService agendamentoService;

	@GetMapping
	public List<Agendamento> mostrarTodosAgendamentos() {
		return this.agendamentoService.mostrarTodosAgendamentos();
}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Agendamento> mostratAgendamentoPorId(@PathVariable String id) {
		Agendamento obj = this.agendamentoService.mostrarAgendamentoPorId(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Agendamento criarAgendamento(@RequestBody Agendamento agendamento) {
		return this.agendamentoService.criarAgendamento(agendamento);
	}

}
