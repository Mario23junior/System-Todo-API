package com.br.api.todo.controller;

import java.util.List;

import com.br.api.todo.model.Todo;
import com.br.api.todo.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	
	@GetMapping(value = "open")
	public ResponseEntity<List<Todo>> findAllOpen(){
		return service.listOPen();
	}
}
