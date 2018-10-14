package routes;

import models.Timestamp;
import spark.Request;
import spark.Response;

public class DefaultRoute extends Route {

	@Override
	public Object handle(Request request, Response response) throws Exception {
		response.type("application/json");
		return gson.toJson(new Timestamp());
	}

}
