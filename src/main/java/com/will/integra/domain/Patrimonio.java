package com.will.integra.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Patrimonio implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String nome;

	private String descricao;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numeroTombo;

	@OneToMany(mappedBy = "patrimonio")
	private List<Marca> marcaId = new ArrayList<>();

	public Patrimonio() {
		super();
	}

	public Patrimonio(String nome, String descricao, Integer numeroTombo) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.numeroTombo = numeroTombo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public List<Marca> getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(List<Marca> marcaId) {
		this.marcaId = marcaId;
	}

}
