package com.pruebas.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class Trigonometria implements InterfazTrigonometria{

	@Override
	public double seno(double radianes) {
		return Math.sin(radianes);
		
	}

	@Override
	public double coseno(double radianes) {
		return Math.cos(radianes);
		
	}

	@Override
	public double tangente(double radianes) {
		return Math.tan(radianes);
		
	}

	@Override
	public double cotangente(double radianes) {
		return Math.cos(radianes)/Math.sin(radianes);
		
	}

	@Override
	public double secante(double radianes) {
		return 1/Math.cos(radianes);
		
	}

	@Override
	public double cosecante(double radianes) {
		return 1/Math.cos(radianes);
		
	}

	

}
