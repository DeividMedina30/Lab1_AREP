package edu.escuelaing.arep;

import junit.framework.TestCase;

/*
 * Funciones Java
 * Curso: Arquitectura Empresaria
 * @version: 1.1
 * @author: Deivid Medina
 */
public class AppTest extends TestCase{
	
	private Celsius_a_Fahrenheit celsius_a_fahrenheit;
	private Fahrenheit_a_Celsius fahrenheit_a_celsius;
	
	/*
	 * Validando correcta conversión de grados celsius a Fahrenheit
	 */
	public void escenarioCelsius_a_Fahrenheit(double valor) {
		celsius_a_fahrenheit = new Celsius_a_Fahrenheit(valor);
	}
	
	/*
	 * Validando correcta conversión de grados celsius a Fahrenheit
	 */
	public void escenarioFahrenheit_a_Celsius(double valor) {
		fahrenheit_a_celsius = new Fahrenheit_a_Celsius(valor);
	}
	
	/*
	 * Validando correcta conversión de grados celsius a Fahrenheit
	 */
	public void test_celsius_A_Fahrenheit() {
		escenarioCelsius_a_Fahrenheit(0);
		assertEquals(32.0,celsius_a_fahrenheit.convertirTemperatura());
	}

	/*
	 * Validando correcta conversión de grados celsius a Fahrenheit
	 */
	public void test_celsius_A_Fahrenheit2() {
		escenarioCelsius_a_Fahrenheit(-273);
		assertEquals(-459.4,celsius_a_fahrenheit.convertirTemperatura());
	}
	
	/*
	 * Validando correcta conversión de grados celsius a Fahrenheit
	 */
	public void test_celsius_A_Fahrenheit3() {
		escenarioCelsius_a_Fahrenheit(50);
		assertEquals(122.0,celsius_a_fahrenheit.convertirTemperatura());
	}
	
	/*
	 * Validando correcta conversión de grados celsius a Fahrenheit
	 */
	public void test_celsius_A_Fahrenheit4() {
		escenarioCelsius_a_Fahrenheit(32);
		assertEquals(89.6,celsius_a_fahrenheit.convertirTemperatura());
	}
	
	/*
	 * Validando correcta conversión de grados celsius a Fahrenheit
	 */
	public void test_celsius_A_Fahrenheit5() {
		escenarioCelsius_a_Fahrenheit(100);
		assertEquals(212.0,celsius_a_fahrenheit.convertirTemperatura());
	}
	
	/*
	 * Validando correcta conversión de grados celsius a Fahrenheit
	 */
	public void test_celsius_A_Fahrenheit6() {
		escenarioCelsius_a_Fahrenheit(11);
		assertEquals(51.8,celsius_a_fahrenheit.convertirTemperatura());
	}
	
	/*
	 * Validando correcta conversión de grados celsius a Fahrenheit
	 */
	public void test_celsius_A_Fahrenheit7() {
		escenarioCelsius_a_Fahrenheit(0);
		assertTrue(celsius_a_fahrenheit.convertirTemperatura()!=45);
	}
	
	/*
	 * Validando correcta conversión de grados celsius a Fahrenheit
	 */
	public void test_celsius_A_Fahrenheit8() {
		escenarioCelsius_a_Fahrenheit(32);
		assertTrue(celsius_a_fahrenheit.convertirTemperatura()!=90);
	}
	
	/*
	 * Validando correcta conversión de grados celsius a Fahrenheit
	 */
	public void test_celsius_A_Fahrenheit9() {
		escenarioCelsius_a_Fahrenheit(20.3);
		assertTrue(celsius_a_fahrenheit.convertirTemperatura()!= 68.55);
	}
	
	/*
	 * Validando correcta conversión de grados celsius a Fahrenheit
	 */
	public void test_celsius_A_Fahrenheit10() {
		escenarioCelsius_a_Fahrenheit(5);
		assertTrue(celsius_a_fahrenheit.convertirTemperatura() == 41.0);
	}
	
	/*
	 * Validando correcta conversión de grados Fahrenheit a celsius
	 */
	public void test_Fahrenheit_A_Celsius() {
		escenarioFahrenheit_a_Celsius(0);
		assertEquals(-17.78,fahrenheit_a_celsius.convertirTemperatura());
	}

	/*
	 * Validando correcta conversión de grados Fahrenheit a celsius
	 */
	public void test_Fahrenheit_A_Celsius2() {
		escenarioFahrenheit_a_Celsius(28.4);
		assertEquals(-2.0,fahrenheit_a_celsius.convertirTemperatura());
	}
	
	/*
	 * Validando correcta conversión de grados Fahrenheit a celsius
	 */
	public void test_Fahrenheit_A_Celsius3() {
		escenarioFahrenheit_a_Celsius(-25);
		assertEquals(-31.67,fahrenheit_a_celsius.convertirTemperatura());
	}
	
	/*
	 * Validando correcta conversión de grados Fahrenheit a celsius
	 */
	public void test_Fahrenheit_A_Celsius4() {
		escenarioFahrenheit_a_Celsius(-4);
		assertEquals(-20.0,fahrenheit_a_celsius.convertirTemperatura());
	}
	
	/*
	 * Validando correcta conversión de grados Fahrenheit a celsius
	 */
	public void test_Fahrenheit_A_Celsius5() {
		escenarioFahrenheit_a_Celsius(104);
		assertEquals(40.0,fahrenheit_a_celsius.convertirTemperatura());
	}
	
	/*
	 * Validando correcta conversión de grados Fahrenheit a celsius
	 */
	public void test_Fahrenheit_A_Celsius6() {
		escenarioFahrenheit_a_Celsius(48.2);
		assertEquals(9.0,fahrenheit_a_celsius.convertirTemperatura());
	}
	
	/*
	 * Validando correcta conversión de grados Fahrenheit a celsius
	 */
	public void test_Fahrenheit_A_Celsius7() {
		escenarioFahrenheit_a_Celsius(122);
		assertTrue(fahrenheit_a_celsius.convertirTemperatura()!=55);
	}
	
	/*
	 * Validando correcta conversión de grados Fahrenheit a celsius
	 */
	public void test_Fahrenheit_A_Celsius8() {
		escenarioFahrenheit_a_Celsius(-58);
		assertTrue(fahrenheit_a_celsius.convertirTemperatura()!=70);
	}
	
	/*
	 * Validando correcta conversión de grados Fahrenheit a celsius
	 */
	public void test_Fahrenheit_A_Celsius9() {
		escenarioFahrenheit_a_Celsius(19.4);
		assertTrue(fahrenheit_a_celsius.convertirTemperatura() != -8);
	}
	
	/*
	 * Validando correcta conversión de grados Fahrenheit a celsius
	 */
	public void test_Fahrenheit_A_Celsius10() {
		escenarioFahrenheit_a_Celsius(50);
		assertTrue(fahrenheit_a_celsius.convertirTemperatura() == 10.0);
	}
	
}
