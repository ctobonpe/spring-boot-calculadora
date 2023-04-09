package com.pruebas.springboot.fundamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pruebas.springboot.fundamentos.component.InterfazMatematica;

@Controller
public class PruebasController {
		
	//inyeccion de la intefaz de matematicas
	
	private InterfazMatematica matematica;
	
	@Autowired
	public PruebasController(InterfazMatematica matematica) {
		this.matematica = matematica;
		// TODO Auto-generated constructor stub
	}	
	
	
	//para mapear las solicitudes del navegador,
	@RequestMapping("/calculadora")	
	public void calculadora(Model modelo){
		
		modelo.addAttribute("titulo","Hola desde thymeleaf");
		modelo.addAttribute("resultadoSuma",matematica.suma(15,65));
		modelo.addAttribute("resultadoResta",matematica.resta(15,65));
		modelo.addAttribute("resultadoMultiplicacion",matematica.multiplicacion(15,65));
		modelo.addAttribute("resultadoDivision",matematica.division(15,65));		
		
	}
	
}
