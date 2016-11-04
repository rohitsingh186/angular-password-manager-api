package com.barclays.service;

import com.barclays.domain.Domain;

public class DomainService {
	
	public Domain getDomain() {
		
		Domain domain = new Domain();
		domain.setId(1);
		domain.setName("Facebook");
		domain.setUserName("rohitsingh17219@gmail.com");
		domain.setPassword("Qwerty@123");
		
		return domain;
		
	}
	
	
}
