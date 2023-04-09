package com.pruebas.springboot.fundamentos;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pruebas.springboot.fundamentos.component.BeanConPropiedades;
import com.pruebas.springboot.fundamentos.component.InterfazMatematica;
import com.pruebas.springboot.fundamentos.pojo.UserPOJO;

@SpringBootApplication
public class PruebasApplication implements CommandLineRunner{

	private Log logger = LogFactory.getLog(PruebasApplication.class);
	
	private BeanConPropiedades beanConPropiedades;
	private UserPOJO userPOJO;
	
	@Autowired
	public PruebasApplication(BeanConPropiedades beanConPropiedades,UserPOJO userPOJO) {
		this.beanConPropiedades = beanConPropiedades;
		this.userPOJO = userPOJO;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PruebasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Creado por: " + beanConPropiedades.getAutor());
		System.out.println(userPOJO.getEmail());
		
		/*try {
			int value = 10/0;
		}catch(Exception e) {
			logger.error(e.getStackTrace());
		}*/	
		
	}

}
