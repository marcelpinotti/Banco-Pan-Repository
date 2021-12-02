package com.example.mongodb.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
public class Agendamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String data;
	
	@DBRef
	private Medico medico;
	
	public Agendamento() {
		super();
	}

	public Agendamento(Medico medico, String data) {
		super();
		this.medico = medico;
		this.data = data;
	}
	
	public Agendamento(String data) {
		super();
		this.data = data;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, id, medico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		return Objects.equals(data, other.data) && Objects.equals(id, other.id) && Objects.equals(medico, other.medico);
	}

	
	
	

}
