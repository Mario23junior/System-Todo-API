package com.br.api.todo.controller;

import com.br.api.todo.model.Todo;
import com.br.api.todo.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projet/todo/")
public class TodoController {

	@Autowired
	private TodoService service;

	@GetMapping("{id}")
	public Todo listIdBase(@PathVariable Long id) {
		return service.listFindById(id);
	}
}
