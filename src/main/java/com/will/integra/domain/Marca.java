package com.will.integra.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Marca implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String nome;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer marcaId;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "patrimonio_numeroTombo")
	private Patrimonio patrimonio;
	
	public Marca() {
		super();

	}

	public Marca(String nome, Integer marcaId, Patrimonio patrimonio) {
		super();
		this.nome = nome;
		this.marcaId = marcaId;
		this.patrimonio = patrimonio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(Integer marcaId) {
		this.marcaId = marcaId;
	}

	public Patrimonio getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(Patrimonio patrimonio) {
		this.patrimonio = patrimonio;
	}  
	
	

}
