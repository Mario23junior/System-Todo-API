package com.br.api.todo.service;

import java.util.List;
import java.util.Optional;

import com.br.api.todo.model.Todo;
import com.br.api.todo.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
  
	@Autowired
	private TodoRepository repository;
	
	public Todo listFindById(Long id){
		Optional<Todo> idbase = repository.findById(id);
		return idbase.orElse(null);
	}
	
	public ResponseEntity<List<Todo>> listOPen(){
		List<Todo> list = repository.findAllOPen();
 		return ResponseEntity.ok().body(list);
	}
	
	public ResponseEntity<List<Todo>> listClose(){
		List<Todo> list = repository.findAllClose();
 		return ResponseEntity.ok().body(list);
	}
}
