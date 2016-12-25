package com.siv.client;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

@Path("/custom-client")
public class CustomClientController {
	
	@Autowired
	CustomClientRepository repo;
	
	@POST
	@Produces("application/json")
	public CustomClientDetail create(CustomClientDetail user){
	
		return repo.save(user);		
	}

}
