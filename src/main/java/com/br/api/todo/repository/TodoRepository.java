package com.br.api.todo.repository;

import com.br.api.todo.model.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
