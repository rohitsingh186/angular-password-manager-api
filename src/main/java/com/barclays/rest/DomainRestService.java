package com.barclays.rest;

import java.util.ArrayList;
import java.util.List;

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
	public List<Domain> getDomain() {
		DomainService domainService = new DomainService();
		
		Domain domain = domainService.getDomain();
		
		List<Domain> domainList = new ArrayList<Domain> ();
		domainList.add(domain);
		return domainList;
	}
	
	
}
