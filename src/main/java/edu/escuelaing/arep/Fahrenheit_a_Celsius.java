package edu.escuelaing.arep;

/**
 * Funciones Java
 * Curso: Arquitectura Empresaria
 * @version 1.1
 * @author Deivid Medina
 */
public class Fahrenheit_a_Celsius extends temperatura {
	
	private double newTemperatura;
	
	/**
	 * Constructor de la clase Fahrenheit_a_Celsius
	 * @param temperaturaDada - Temperatura en grado Fahrenheit, en formato double.
	 */
	public Fahrenheit_a_Celsius(double temperaturaDada) {
		super(temperaturaDada);
	}
	
	/**
	 * Función get que me retorna la Temperatura de Fahrenheit a Celsius - retorna un double redondeado.
	 */
	public double getNewTemperatura() {
		return Math.round(newTemperatura*100.0)/100.0;
	}
	
	/**
	 * Función Set que me permite modificar el valor de la temperatura
	 * @param newTemperatura - Nombre de la temperatura dada, el valor es double.
	 */
	public void setNewTemperatura(double newTemperatura) {
		this.newTemperatura = (newTemperatura - 32) / 1.8;
	}
	
	/**
	 * Funcón abtracta donde se crea el método para pasar de Fahrenheit a Celsius.
	 */
	@Override
	public double convertirTemperatura() {
		setNewTemperatura(getTemperaturaDada());
		return getNewTemperatura();
	}

}
