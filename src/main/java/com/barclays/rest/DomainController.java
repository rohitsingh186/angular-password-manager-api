package com.barclays.rest;

import com.barclays.domain.Domain;
import com.barclays.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DomainController {
    private final DomainService domainService;

    @Autowired
    public DomainController(DomainService domainService) {
        this.domainService = domainService;
    }

    @RequestMapping("/domains")
    public List<Domain> getDomains() {
        List<Domain> domainList = domainService.getDomains();
        return domainList;
    }
}
