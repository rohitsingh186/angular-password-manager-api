package com.barclays.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class DomainWrapper {
	
	private List<Domain> domainList;
	
	public DomainWrapper() {
	}

	public List<Domain> getDomain() {
		return domainList;
	}

	public void setDomain(List<Domain> domainList) {
		this.domainList = domainList;
	}
	
}
