package edu.escuelaing.arep;

public class Fahrenheit_a_Celsius extends temperatura {
	
	private double newTemperatura;

	public Fahrenheit_a_Celsius(double temperaturaDada) {
		super(temperaturaDada);
	}

	public double getNewTemperatura() {
		return Math.round(newTemperatura*100.0)/100.0;
	}

	public void setNewTemperatura(double newTemperatura) {
		this.newTemperatura = (newTemperatura - 32) / 1.8;
	}

	@Override
	public double convertirTemperatura() {
		setNewTemperatura(getTemperaturaDada());
		return getNewTemperatura();
	}

}
