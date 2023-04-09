package com.pruebas.springboot.fundamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pruebas.springboot.fundamentos.component.BeanConPropiedades;
import com.pruebas.springboot.fundamentos.component.InterfazMatematica;

@SpringBootApplication
public class PruebasApplication implements CommandLineRunner{

	private BeanConPropiedades beanConPropiedades;
	
	@Autowired
	public PruebasApplication(BeanConPropiedades beanConPropiedades) {
		this.beanConPropiedades = beanConPropiedades;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PruebasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Creado por: " + beanConPropiedades.getAutor());
		
	}

}
