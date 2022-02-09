package edu.escuelaing.arep;

import static spark.Spark.*;
import com.google.gson.Gson;

/**
 * Funciones Java
 * Curso: Arquitectura Empresaria
 * @version 1.1
 * @author Deivid Medina
 * 
 */
public class SparkWebApp {
	
	/**
	 * Función main que me permite invocar el API.
	 * @param args - Recibe un String como argumento.
	 */
    public static void main(String[] args) {
    	port(getHerokuAssignedPort());
        staticFiles.location("/paginaWeb");
        get("/", (req, res) -> {
            res.redirect("/index.html");
            return null;
        });
        path("/calcularTemperatura",()->{
            get("/Celsius/:value", (req, res)->{
                return getCelsius(Double.valueOf(req.params(":value")));
            });
            get("/Fahrenheit/:value", (req, res)->{
                return getFahrenheit(Double.valueOf(req.params(":value")));
            });
        });
    }
    
    /**
     * Funcón que me permite obtener el puerto por el cual heroku despliega nuestra aplicación.
     */
    public	static int getHerokuAssignedPort() {
    	ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

    /**
     * Funcón getCelsius, me retorna la conversión de grados Celsius a Fahrenheit, el valor es un double.
     */
    private static Object getCelsius(double valor) {
        Celsius_a_Fahrenheit celsius_a_fahrenheit = new Celsius_a_Fahrenheit(valor);
        return new Gson().toJson(celsius_a_fahrenheit.convertirTemperatura());
    }
    
    /**
     * Funcón getCelsius, me retorna la conversión de grados Fahrenheit a Celsius, el valor es un double.
     */
    private static Object getFahrenheit(double valor) {
        Fahrenheit_a_Celsius fahrenheit_a_celsius =  new Fahrenheit_a_Celsius(valor);
        return new Gson().toJson(fahrenheit_a_celsius.convertirTemperatura());
    }
}
