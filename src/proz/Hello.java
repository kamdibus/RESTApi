package proz;

import javax.websocket.server.PathParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/")
public class Hello {
	// @GET
	// @Path("{user}")
	// public String sayHello(@PathParam("user") String name) {
	// return "Hello" + name;
	// }

	@GET
	public String sayHello(@DefaultValue("Kamil") @QueryParam("user") String name) {
		return "Hello " + name;
	}

}