package com.barclays.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.barclays.domain.DomainWrapper;
import com.barclays.service.DomainService;

@Path("/domains")
public class DomainRestService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDomains() {
		DomainService domainService = new DomainService();

		DomainWrapper domainWrapper = domainService.getDomainWrapper();
		// List<Domain> domainList = domainService.getDomains();

		return Response.ok().entity(domainWrapper)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.build();
		// return domainList;
	}

}
