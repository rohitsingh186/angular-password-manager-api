package com.barclays.service;

import java.util.ArrayList;
import java.util.List;

import com.barclays.domain.Domain;
import com.barclays.domain.DomainWrapper;
import org.springframework.stereotype.Service;

@Service
public class DomainService {

	public List<Domain> getDomains() {
		List<Domain> domainList = new ArrayList<Domain> ();
		
		Domain domain = new Domain();
		domain.setId(1);
		domain.setName("Gmail");
		domain.setUserName("abc.com");
		domain.setPassword("Qwerty@123");
		
		domainList.add(domain);
		
		domain = new Domain();
		domain.setId(2);
		domain.setName("Facebook");
		domain.setUserName("fgh@gmail.com");
		domain.setPassword("Qwerty@123");
		
		domainList.add(domain);
		
		return domainList;
	}
}
