import static spark.Spark.*;
import routes.*;

public class Main {
    
	public static void main(String[] args) {
    	port(System.getenv("PORT") != null ? Integer.parseInt(System.getenv("PORT")) : 8082);
        get("/", new DefaultRoute());
    }
	
}