package com.deveducation.aspas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_tema")
public class TemaModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTema;
	
	@Column
	@NotNull
	private String materia;
	
	@Column
	private String submateria;
	
	@Column
	@NotNull
	private String serie;
	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tema")
	private List<PostagemModel> postagem;

	public Long getIdTema() {
		return idTema;
	}

	public void setIdTema(Long idTema) {
		this.idTema = idTema;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getSubmateria() {
		return submateria;
	}

	public void setSubmateria(String submateria) {
		this.submateria = submateria;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public List<PostagemModel> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<PostagemModel> postagem) {
		this.postagem = postagem;
	}
	
	

}
