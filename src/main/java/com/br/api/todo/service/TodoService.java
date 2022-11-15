package com.br.api.todo.service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.br.api.todo.exceptions.ReturnErroObjectFailed;
import com.br.api.todo.model.Todo;
import com.br.api.todo.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;

	public Todo listFindById(Long id) {
		Optional<Todo> idbase = repository.findById(id);
		return idbase.orElseThrow(()
				-> new ReturnErroObjectFailed("Erro ao encontrar tarefa de id : "+
		id+", por favor revise os valores em "+Todo.class.getName()));
	}

	public ResponseEntity<List<Todo>> listOPen() {
		List<Todo> list = repository.findAllOPen();
		return ResponseEntity.ok().body(list);
	}

	public ResponseEntity<List<Todo>> listClose() {
		List<Todo> list = repository.findAllClose();
		return ResponseEntity.ok().body(list);
	}

	public ResponseEntity<List<Todo>> listAll() {
		List<Todo> list = repository.findAll();
		ResponseEntity<List<Todo>> lis = ResponseEntity.ok().body(list);
		return lis;
	}

	public ResponseEntity<Todo> create(Todo todo) {
		todo.setId(null);
		Todo save = repository.save(todo);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(save.getId()).toUri();
		ResponseEntity<Todo> savebase = ResponseEntity.created(uri).body(save);
		return savebase;
	}

	public ResponseEntity<Todo> delete(Long id) {
		repository.deleteById(id);
		ResponseEntity<Todo> base = ResponseEntity.noContent().build();
		return base;
	}

	public ResponseEntity<Todo> updateTodo(Long id, Todo todo) {
		Todo idfind = listFindById(id);
		idfind.setTitulo(todo.getTitulo());
		idfind.setDataParaFinalizar(todo.getDataParaFinalizar());
		idfind.setFinalizado(todo.getFinalizado());
		idfind.setDescricao(todo.getDescricao());
		Todo savebase = repository.save(idfind);
		return ResponseEntity.ok().body(savebase);

	}

}
