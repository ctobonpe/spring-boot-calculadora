package com.pruebas.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class Aritmetica implements InterfazAritmetica {

	@Override
	public int suma(int a, int b) {
		return a + b;
		
	}

	@Override
	public int resta(int a, int b) {
		return a - b;
		
	}

	@Override
	public int multiplicacion(int a, int b) {
		return a * b;
		
	}

	@Override
	public double division(int a, int b) {
		return a / b;
		
	}

	
	

}
