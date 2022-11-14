package com.br.api.todo.config;

import com.br.api.todo.service.DBServiceCarga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
public class CargaBaseTestInsert {
   
	@Autowired
	private DBServiceCarga carga;
	
	@Bean
	public boolean instance() {
		this.carga.instanceBaseCarga();
		return true;
	}
}
