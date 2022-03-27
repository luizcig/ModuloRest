package main.java.com.wit.rest;

import main.java.com.wit.calculator.Sum;
import main.java.com.wit.calculator.Subtraction;
import main.java.com.wit.calculator.Multiplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import main.java.com.wit.calculator.DivideByZeroException;
import main.java.com.wit.calculator.Division;

public class Calcula {
	private static final Logger LOGGER=LoggerFactory.getLogger(Calcula.class);
	private final long id;
	private Double result;
	private final Double a;
	private final Double b;

	public Calcula(long id, Double a, Double b) {
		LOGGER.debug("Inicializando o metodo Calcula");
		LOGGER.debug("	Valor a="+a);
		LOGGER.debug("	Valor b="+b);
		this.id = id;
		this.a = a;
		this.b = b;		
	}

	public void Sum() {
		LOGGER.debug("Executando o metodo Sum");
		Sum sum = new Sum( a, b );
		result = sum.getResult();
	}
	
	public void Subtraction() {
		LOGGER.debug("Executando o metodo Subtraction");
		Subtraction subtraction = new Subtraction( a, b );
		result = subtraction.getResult();		
	}

	public void Multiplication() {
		LOGGER.debug("Executando o metodo Multiplication");
		Multiplication multiplication = new Multiplication( a, b );
		result = multiplication.getResult();		
	}

	public void Division(int precision) {
		LOGGER.debug("Executando o metodo Division");
		Division division;
		try {
			division = new Division( a, b, precision);
			result = division.getResult().doubleValue();				
		} catch (DivideByZeroException e) {
			LOGGER.error(e.getMessage());
		}
	}
	
	public long getId() {
		return id;
	}

	public Double getResult() {
		return result;
	}
}
