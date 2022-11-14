package com.br.api.todo.service;

import java.util.Optional;

import com.br.api.todo.model.Todo;
import com.br.api.todo.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
  
	@Autowired
	private TodoRepository repository;
	
	public Todo listFindById(Long id){
		Optional<Todo> idbase = repository.findById(id);
		return idbase.orElse(null);
	}
}
