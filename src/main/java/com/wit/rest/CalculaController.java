package  main.java.com.wit.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.wit.calculator.Division;
import main.java.com.wit.calculator.Multiplication;
import main.java.com.wit.calculator.Subtraction;
import main.java.com.wit.calculator.Sum;

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
	
	/** Este método Soma do RestApplication.
	* @param a NUMBER e b NUMBER
	* @return JSON result.
	*/
	@GetMapping("/sum")
	public Sum sum(@RequestParam(value = "a", defaultValue = "0") Double a, 
			       @RequestParam(value = "b", defaultValue = "0") Double b) {
		return new Sum( a, b );
	}
	/**
	* Este método Subtração do RestApplication.
	* @param a NUMBER e b NUMBER
	* @return JSON result.
	*/	
	@GetMapping("/subtraction")
	public Subtraction subtraction(@RequestParam(value = "a", defaultValue = "0") Double a, 
			       @RequestParam(value = "b", defaultValue = "0") Double b) {
		return new Subtraction( a, b );
	}	
	/**
	* Este método Multiplicação do RestApplication.
	* @param a NUMBER e b NUMBER
	* @return JSON result.
	*/	
	@GetMapping("/multiplication")
	public Multiplication multiplication(@RequestParam(value = "a", defaultValue = "0") Double a, 
			       @RequestParam(value = "b", defaultValue = "0") Double b) {
		return new Multiplication( a, b );
	}
	/**
	* Este método Divisão do RestApplication.
	* @param a NUMBER e b NUMBER
	* @return JSON result.
	*/		
	@GetMapping("/division")
	public Division division(@RequestParam(value = "a", defaultValue = "0") Double a, 
			       @RequestParam(value = "b", defaultValue = "0") Double b) {
		return new Division( a, b, precision );
	}	
}
