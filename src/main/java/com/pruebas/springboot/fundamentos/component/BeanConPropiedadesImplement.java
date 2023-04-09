package com.pruebas.springboot.fundamentos.component;

public class BeanConPropiedadesImplement implements BeanConPropiedades {

	private String nombre;
	private String apellido;
	
	public BeanConPropiedadesImplement(String nombre,String apellido)
	{
		this.nombre = nombre;
		this.apellido = apellido;
	}
		
	@Override
	public String getAutor() {		
		return nombre + " " + apellido;
	}
}
