package com.barclays.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.barclays.domain.Domain;
import com.barclays.service.DomainService;



@Path("/domains")
public class DomainRestService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Domain getDomain() {
		DomainService domainService = new DomainService();
		return domainService.getDomain();
	}
	
	
}
