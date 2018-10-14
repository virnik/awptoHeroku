package routes;

import com.google.gson.Gson;

public abstract class Route implements spark.Route {

	protected Gson gson;
	
	public Route() {
		gson = new Gson();
	}

}