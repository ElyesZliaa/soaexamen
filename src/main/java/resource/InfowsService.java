package resource;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import entities.InfoSante;
 
@Path("suivi")
public class InfowsService {

	List<InfoSante>	lst=new ArrayList<>();	


	public InfowsService() {
	
	}
	

	@POST
	@Consumes("application/xml")
	@Produces("application/json")
	public Response ajout(InfoSante infoSante)
	{ 	 
		lst.add(infoSante);
	 	
	return Response.status(Response.Status.CREATED).entity(lst).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response lister()
	{	
		return Response.status(Response.Status.CREATED).entity(lst).build(); 
	}
}
