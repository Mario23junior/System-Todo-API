package com.br.api.todo.handlerErrosReturn;

import java.util.Date;

import com.br.api.todo.exceptions.ReturnErroObjectFailed;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class handlerErrosReturn {

	@ExceptionHandler(ReturnErroObjectFailed.class)
	public ResponseEntity<ModelErroReturn> ErreReturn(ReturnErroObjectFailed exceptions, WebRequest request) {
      ModelErroReturn error = new ModelErroReturn(
    		  HttpStatus.NOT_FOUND.value(),
    		  new Date(), 
    		  exceptions.getMessage(),
     		  request.getDescription(false));
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
