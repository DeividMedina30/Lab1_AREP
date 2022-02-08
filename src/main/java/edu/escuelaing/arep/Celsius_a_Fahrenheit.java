package edu.escuelaing.arep;


public class Celsius_a_Fahrenheit extends temperatura {
	
	private double newTemperatura;
	
	public Celsius_a_Fahrenheit(double temperaturaDada) {
		super(temperaturaDada);
	}

	public double getNewTemperatura() {
		return Math.round(newTemperatura*100.0)/100.0;
	}

	public void setNewTemperatura(double newTemperatura) {
		this.newTemperatura = (1.8 * newTemperatura) + 32;
	}

	@Override
	public double convertirTemperatura() {
		setNewTemperatura(getTemperaturaDada());
		return getNewTemperatura();
	}

}
