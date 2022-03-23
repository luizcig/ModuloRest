package main.java.com.wit.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
* <h1>REST API Calculator</h1>
* O REST API disponibiliza funcionalidade básicas de uma calculadora
* que dá suporte para dois números fornecidos e retorna o resultado
* atraves de um JSON.
* <p>
* @author  Luiz Carlos Fernandes
* @version 1.0
* @since   2022-03-23
* <p>
* Este é o método principal que faz RestApplication.
* @param args Unused.
* @return Nothing.
*/
@SpringBootApplication
public class RestApplication {
	private static final Logger LOGGER=LoggerFactory.getLogger(RestApplication.class);
	public static void main(String[] args) {
		LOGGER.info("RestApplication - Start...");
		SpringApplication.run(RestApplication.class, args);
	}

}
