package com.br.api.todo.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.br.api.todo.model.Todo;
import com.br.api.todo.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBServiceCarga {

	@Autowired
	private TodoRepository repository;

	public void instanceBaseCarga() {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo();
		t1.setId(null);
		t1.setDecricao("Realizar caminhadas pelal manhãn as 09:00.");
		t1.setTitulo("Estudar");
		t1.setFinalizado(false);
		t1.setDataParaFinalizar(LocalDateTime.parse("13/11/2022 10:40", format));
		repository.save(t1);
	}
}
