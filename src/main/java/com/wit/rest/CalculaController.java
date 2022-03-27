package  main.java.com.wit.rest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* <h1>REST API Calculator</h1>
* O REST API disponibiliza funcionalidade  básicas de uma calculadora
* que dá suporte para dois  números fornecidos e retorna o resultado
* atraves de um JSON.
* <p>
* @see     Sum
* @see     Subtraction
* @see     Multiplication
* @see     Division
* @author  Luiz Carlos Fernandes
* @version 1.0
* @since   2022-03-23
* <p>
* Este método CalculaController do RestApplication.
* @param application.precision
*/
@RestController
public class CalculaController {
	@Value("${application.precision}")
	private int precision;
	private final AtomicLong counter = new AtomicLong();
	
	/** Este método Soma do RestApplication.
	* @param a NUMBER e b NUMBER
	* @return JSON result.
	*/
	@GetMapping("/sum")
	public Calcula sum(@RequestParam(value = "a", defaultValue = "0") Double a, 
			       @RequestParam(value = "b", defaultValue = "0") Double b) {
		Calcula calcula = new Calcula(counter.incrementAndGet(), a, b );
		calcula.Sum();
		return calcula;
	}
	/**
	* Este método Subtração do RestApplication.
	* @param a NUMBER e b NUMBER
	* @return JSON result.
	*/	
	@GetMapping("/subtraction")
	public Calcula subtraction(@RequestParam(value = "a", defaultValue = "0") Double a, 
			       @RequestParam(value = "b", defaultValue = "0") Double b) {
		Calcula calcula = new Calcula(counter.incrementAndGet(), a, b );
		calcula.Subtraction();
		return calcula;		
	}	
	/**
	* Este método Multiplicação do RestApplication.
	* @param a NUMBER e b NUMBER
	* @return JSON result.
	*/	
	@GetMapping("/multiplication")
	public Calcula multiplication(@RequestParam(value = "a", defaultValue = "0") Double a, 
			       @RequestParam(value = "b", defaultValue = "0") Double b) {
		Calcula calcula = new Calcula(counter.incrementAndGet(), a, b );
		calcula.Multiplication();
		return calcula;		
	}
	/**
	* Este método Divisão do RestApplication.
	* @param a NUMBER e b NUMBER
	* @return JSON result.
	*/		
	@GetMapping("/division")
	public Calcula division(@RequestParam(value = "a", defaultValue = "0") Double a, 
			       @RequestParam(value = "b", defaultValue = "0") Double b) {
		Calcula calcula = new Calcula(counter.incrementAndGet(), a, b );
		calcula.Division(precision);
		return calcula;		
	}	
}
