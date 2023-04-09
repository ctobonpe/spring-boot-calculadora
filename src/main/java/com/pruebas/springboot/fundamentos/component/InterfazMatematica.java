package com.pruebas.springboot.fundamentos.component;

public interface InterfazMatematica {

	int suma(int a, int b);
	int resta(int a,int b);
	int multiplicacion(int a,int b);
	double division(int a, int b);
	
	void seno(int grados);
	void coseno(int grados);
	void tangente(int grados);
	void cotangente(int grados);
	void secante(int grados);
	void cosecante(int grados);	
	
	
}
