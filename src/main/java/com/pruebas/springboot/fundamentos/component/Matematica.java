package com.pruebas.springboot.fundamentos.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class Matematica implements InterfazMatematica {
	
	Log logger = LogFactory.getLog(Matematica.class);
	
	private InterfazAritmetica aritmetica;
	private InterfazTrigonometria trigonometria;

	public Matematica(InterfazAritmetica aritmetica, InterfazTrigonometria trigonometria ) {
		this.aritmetica = aritmetica;
		this.trigonometria = trigonometria;
	}

	@Override
	public int suma(int a, int b) {

		return aritmetica.suma(a, b);
		
	}

	@Override
	public int resta(int a, int b) {
		
		return aritmetica.resta(a, b);
		
	}

	@Override
	public int multiplicacion(int a, int b) {
		
		return aritmetica.multiplicacion(a, b);
		
	}

	@Override
	public double division(int a, int b) {
		
		return aritmetica.division(a, b);
		
	}

	
	//debo convertir grados(entrada) en radianes, y luego usar el metodo math.sin o el que aplique
	
	@Override
	public void seno(int grados) {
		
		double radianes = Math.toRadians(grados);
		System.out.println("El seno de " + grados + " grados es " + trigonometria.seno(radianes));
		
	}

	@Override
	public void coseno(int grados) {
		double radianes = Math.toRadians(grados);
		System.out.println("El coseno de " + grados + " grados es " + trigonometria.coseno(radianes));
	}

	@Override
	public void tangente(int grados) {
		double radianes = Math.toRadians(grados);
		System.out.println("La tangente de " + grados + " grados es " + trigonometria.tangente(radianes));
		
	}

	@Override
	public void cotangente(int grados) {
		double radianes = Math.toRadians(grados);
		System.out.println("La cotangente de " + grados + " grados es " + trigonometria.cotangente(radianes));
		
	}

	@Override
	public void secante(int grados) {
		double radianes = Math.toRadians(grados);
		System.out.println("la secante de " + grados + " grados es " + trigonometria.secante(radianes));
		
	}

	@Override
	public void cosecante(int grados) {
		double radianes = Math.toRadians(grados);
		System.out.println("La cosecante de " + grados + " grados es " + trigonometria.cosecante(radianes));
		
	}

	
	
}
