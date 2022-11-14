package com.br.api.todo.repository;

import java.util.List;

import com.br.api.todo.model.Todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TodoRepository extends JpaRepository<Todo, Long>{

	@Query("select obj from Todo obj WHERE obj.finalizado = false ORDER BY obj.dataParaFinalizar")
	List<Todo> findAllOPen();

	@Query("select obj from Todo obj WHERE obj.finalizado = true ORDER BY obj.dataParaFinalizar")
	List<Todo> findAllClose();

}
