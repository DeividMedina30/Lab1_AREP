package edu.escuelaing.arep;

/*
 * Creado por Deivid Medina en 07/02/2022
 */

public abstract class temperatura {
	protected double temperaturaDada;
	
	//Constructor de la clase temperatura
	public temperatura(double temperaturaDada) {
		this.temperaturaDada = temperaturaDada;
	}
		
	public double getTemperaturaDada() {
		return temperaturaDada;
	}

	public void setTemperaturaDada(double temperaturaDada) {
		this.temperaturaDada = temperaturaDada;
	}

	public abstract double convertirTemperatura();
}
