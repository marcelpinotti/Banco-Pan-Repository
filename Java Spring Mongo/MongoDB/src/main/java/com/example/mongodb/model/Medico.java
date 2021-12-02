package com.example.mongodb.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
public class Medico {

	@Id
	private String id;
	private String nome;
	private String documentoProfissional;
	private String especialidade;
	private String telefone;
	
	
	public Medico() {
	}

	public Medico(String nome, String documentoProfissional, String especialidade, String telefone) {
		super();
		this.nome = nome;
		this.documentoProfissional = documentoProfissional;
		this.especialidade = especialidade;
		this.telefone = telefone;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	public String getDocumentoProfissional() {
		return documentoProfissional;
	}



	public void setDocumentoProfissional(String documentoProfissional) {
		this.documentoProfissional = documentoProfissional;
	}



	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	@Override
	public int hashCode() {
		return Objects.hash(documentoProfissional, especialidade, id, nome, telefone);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		return Objects.equals(documentoProfissional, other.documentoProfissional)
				&& Objects.equals(especialidade, other.especialidade) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(telefone, other.telefone);
	}

	
	



	
	
	
	
	
	
}
