package com.pruebas.springboot.fundamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pruebas.springboot.fundamentos.component.InterfazMatematica;

@SpringBootApplication
public class PruebasApplication implements CommandLineRunner{

	/*@Autowired
	private InterfazMatematica matematica;*/
	
	/*public PruebasApplication(InterfazMatematica matematica) {
		this.matematica = matematica;
		
	}*/	
	
	public static void main(String[] args) {
		SpringApplication.run(PruebasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*matematica.suma(15, 65);
		matematica.resta(65,15);
		matematica.multiplicacion(15, 65);
		matematica.division(65,15);	*/
		
		/************************************/
		
		
		/*matematica.seno(45);
		matematica.coseno(45);
		matematica.tangente(45);
		matematica.cotangente(45);
		matematica.secante(45);
		matematica.cosecante(45);*/
		
	}

}
