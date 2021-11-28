package org.microsoft.outlook.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_topico")
public class Topico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String topico_descricao;
	
	@OneToMany(mappedBy = "topico", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("topico")
	private List<Texto> topico;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTopico_descricao() {
		return topico_descricao;
	}

	public void setTopico_descricao(String topico_descricao) {
		this.topico_descricao = topico_descricao;
	}

	public List<Texto> getTopico() {
		return topico;
	}

	public void setTopico(List<Texto> topico) {
		this.topico = topico;
	}
	

}
