package edu.escuelaing.arep;

import static spark.Spark.*;
public class SparkWebApp {
	
	
    public static void main(String[] args) {
    	port(getHerokuAssignedPort());
        get("/hello", (req, res) -> "Hello Heroku");
    }
    
    /*
     * 	Heroku asigna a su aplicación un nuevo puerto cada vez que la implementa
     *  Debemos obtener este puerto y decirle a Spark que lo use
     */
    public	static int getHerokuAssignedPort() {
    	ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
