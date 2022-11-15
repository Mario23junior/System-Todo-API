package com.br.api.todo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Todo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;

	@Column(length = 5000)
	private String descricao;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataParaFinalizar;
	private Boolean finalizado = false;

	public Todo() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataParaFinalizar() {
		return dataParaFinalizar;
	}

	public void setDataParaFinalizar(Date dataParaFinalizar) {
		this.dataParaFinalizar = dataParaFinalizar;
	}

	public Boolean getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataParaFinalizar, descricao, finalizado, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(dataParaFinalizar, other.dataParaFinalizar) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(finalizado, other.finalizado) && Objects.equals(titulo, other.titulo);
	}

}
