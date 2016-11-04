package com.barclays.domain;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class DomainWrapper {
	
	private Domain domain;
	
	public DomainWrapper() {
	}

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}
	
}
