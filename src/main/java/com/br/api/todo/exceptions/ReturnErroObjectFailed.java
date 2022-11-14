package com.br.api.todo.exceptions;

public class ReturnErroObjectFailed extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ReturnErroObjectFailed(String message, Throwable cause) {
		super(message, cause);
 	}

	public ReturnErroObjectFailed(String message) {
		super(message);
		
	}

}
