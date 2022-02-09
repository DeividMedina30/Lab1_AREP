package edu.escuelaing.arep;

/*
 * Funciones Java
 * Curso: Arquitectura Empresaria
 * @version: 1.1
 * @author: Deivid Medina
 */
public abstract class temperatura {
	protected double temperaturaDada;
	
	//Constructor de la clase temperatura
	public temperatura(double temperaturaDada) {
		this.temperaturaDada = temperaturaDada;
	}
	
	/*
	 * Función get que me retorna la Temperatura - retorna un double
	 */
	public double getTemperaturaDada() {
		return temperaturaDada;
	}
	
	/*
	 * Función Set que me permite modificar el valor de la temperatura
	 * @param temperaturaDada - Nombre de la temperatura dada, el valor es double.
	 */
	public void setTemperaturaDada(double temperaturaDada) {
		this.temperaturaDada = temperaturaDada;
	}
	
	/*
	 * Función abstracta la cual me va permitir implementar el metodo correspondiente a la conversión de temperatura.
	 */
	public abstract double convertirTemperatura();
}
