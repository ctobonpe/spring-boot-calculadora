package com.pruebas.springboot.fundamentos.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pruebas.springboot.fundamentos.component.BeanConPropiedades;
import com.pruebas.springboot.fundamentos.component.BeanConPropiedadesImplement;

@Configuration
public class ConfigurationClass {
	
	@Value("${value.name}")
	private String name;
	
	@Value("${value.apellido}")
	private String apellido;
	
	@Value("${value.random}")
	private String random;
	
	
	@Bean
	public BeanConPropiedades contructor() {
		return new BeanConPropiedadesImplement(name,apellido);		
	}
	
	

}
