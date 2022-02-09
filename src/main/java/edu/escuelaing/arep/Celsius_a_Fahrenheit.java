package edu.escuelaing.arep;

/**
 * Funciones Java
 * Curso: Arquitectura Empresaria
 * @version 1.1
 * @author Deivid Medina
 */
public class Celsius_a_Fahrenheit extends temperatura {
	
	private double newTemperatura;
	
	/**
	 * Contrcutor de la clase Celsius_a_Fahrenheit
	 * @param temperaturaDada - Temperatura en grado Celsius, formato de dato double.
	 */
	public Celsius_a_Fahrenheit(double temperaturaDada) {
		super(temperaturaDada);
	}
	
	/**
	 * Función get que me retorna la Temperatura de Celsius a Fahrenheit - retorna un double redondeado.
	 */
	public double getNewTemperatura() {
		return Math.round(newTemperatura*100.0)/100.0;
	}
	
	/**
	 * Función Set que me permite modificar el valor de la temperatura
	 * @param newTemperatura - Nombre de la temperatura dada, el valor es double.
	 */
	public void setNewTemperatura(double newTemperatura) {
		this.newTemperatura = (1.8 * newTemperatura) + 32;
	}
	
	/**
	 * Funcón abtracta donde se crea el método para pasar de Celsius a Fahrenheit.
	 */
	@Override
	public double convertirTemperatura() {
		setNewTemperatura(getTemperaturaDada());
		return getNewTemperatura();
	}

}
