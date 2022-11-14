package com.br.api.todo.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Todo {

	private Long id;
	private String titulo;
	private String decricao;
	private LocalDateTime dataParaFinalizar;
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

	public String getDecricao() {
		return decricao;
	}

	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}

	public LocalDateTime getDataParaFinalizar() {
		return dataParaFinalizar;
	}

	public void setDataParaFinalizar(LocalDateTime dataParaFinalizar) {
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
		return Objects.hash(dataParaFinalizar, decricao, finalizado, titulo);
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
		return Objects.equals(dataParaFinalizar, other.dataParaFinalizar) && Objects.equals(decricao, other.decricao)
				&& Objects.equals(finalizado, other.finalizado) && Objects.equals(titulo, other.titulo);
	}

}
