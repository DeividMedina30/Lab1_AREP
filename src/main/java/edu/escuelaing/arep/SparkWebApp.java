package edu.escuelaing.arep;

import static spark.Spark.*;

import com.google.gson.Gson;
import edu.escuelaing.temperatura.*;
public class SparkWebApp {
	
	
    public static void main(String[] args) {
    	port(getHerokuAssignedPort());
        get("/hello", (req, res) -> "Hello Heroku");
        path("/calcularTemperatura",()->{
            get("/Celsius/:value", (req, res)->{
                return getCelsius(Double.valueOf(req.params(":value")));
            });
            get("/Fahrenheit/:value", (req, res)->{
                return getFahrenheit(Double.valueOf(req.params(":value")));
            });
        });
    }
    
    /*
     * 	Heroku asigna a su aplicaci�n un nuevo puerto cada vez que la implementa
     *  Debemos obtener este puerto y decirle a Spark que lo use
     */
    public	static int getHerokuAssignedPort() {
    	ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

    private static Object getCelsius(double valor) {
        return new Gson().toJson(new Celsius_a_Fahrenheit(valor));
    }

    private static Object getFahrenheit(double valor) {
        return new Gson().toJson(new Fahrenheit_a_Celsius(valor));
    }
}
