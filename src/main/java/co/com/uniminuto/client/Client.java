package co.com.uniminuto.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * 
 * 
 *
 */
@Path("/")
public interface Client {

	@GET
	@Path("/consultarRegistros")
	@Produces(MediaType.APPLICATION_JSON)
	public void consultarRegistros();
	
	@POST
	@Path("/insertarCalificacion")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertarCalificacion();

}