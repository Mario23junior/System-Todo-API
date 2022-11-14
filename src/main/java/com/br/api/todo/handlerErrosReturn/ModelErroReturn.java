package com.br.api.todo.handlerErrosReturn;

import java.io.Serializable;

public class ModelErroReturn implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long status;
	private String message;
	private String timestamp;
	private String path;

	public ModelErroReturn() {
		// TODO Auto-generated constructor stub
	}

	public ModelErroReturn(Long status, String message, String timestamp, String path) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
		this.path = path;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
