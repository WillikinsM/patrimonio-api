package com.will.integra.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Patrimonio implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String nome;
	@NotEmpty
	private Integer marcaId;
	
	private String descricao;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numeroTombo;

	public Patrimonio() {
		super();
	}

	public Patrimonio(String nome, Integer marcaid, String descricao, Integer numeroTombo) {
		super();
		this.nome = nome;
		this.marcaId = marcaid;
		this.descricao = descricao;
		this.numeroTombo = numeroTombo;
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

	public void setMarcaid(Integer marcaid) {
		this.marcaId = marcaid;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getNumeroTombo() {
		return numeroTombo;
	}

	public void setNumeroTombo(Integer numeroTombo) {
		this.numeroTombo = numeroTombo;
	}

}
