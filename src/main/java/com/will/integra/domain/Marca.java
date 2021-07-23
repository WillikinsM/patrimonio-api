package com.will.integra.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Marca implements Serializable {

	private static final long serialVersionUID = 1L;
	@NotEmpty
	private String nome;
	@Id
	@NotEmpty
	private Integer marcaId;

	public Marca() {
		super();

	}

	public Marca(String nome, Integer marcaId) {
		super();
		this.nome = nome;
		this.marcaId = marcaId;
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

}
