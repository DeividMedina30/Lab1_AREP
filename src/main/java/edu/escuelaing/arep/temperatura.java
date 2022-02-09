package edu.escuelaing.arep;

/**
 * Funciones Java
 * Curso: Arquitectura Empresaria
 * @version 1.1
 * @author Deivid Medina
 */
public abstract class temperatura {
	protected double temperaturaDada;
	
	/**
	 * Constructor de la clase Temperatura
	 * @param temperaturaDada - Recibe un double el cual representa la temperatura inicial
	 */
	public temperatura(double temperaturaDada) {
		this.temperaturaDada = temperaturaDada;
	}
	
	/**
	 * Funci�n get que me retorna la Temperatura - retorna un double
	 */
	public double getTemperaturaDada() {
		return temperaturaDada;
	}
	
	/**
	 * Funci�n Set que me permite modificar el valor de la temperatura
	 * @param temperaturaDada - Nombre de la temperatura dada, el valor es double.
	 */
	public void setTemperaturaDada(double temperaturaDada) {
		this.temperaturaDada = temperaturaDada;
	}
	
	/**
	 * Funci�n abstracta la cual me va permitir implementar el metodo correspondiente a la conversi�n de temperatura.
	 */
	public abstract double convertirTemperatura();
}
