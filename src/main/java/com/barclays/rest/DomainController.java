package com.barclays.rest;

import com.barclays.domain.Domain;
import com.barclays.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class DomainController {
    private final DomainService domainService;

    @Autowired
    public DomainController(DomainService domainService) {
        this.domainService = domainService;
    }

    @RequestMapping(value = "/domains", method = GET)
    public List<Domain> getDomains() {
        List<Domain> domainList = domainService.getDomains();
        return domainList;
    }

    @ResponseBody
    @RequestMapping(value = "/domains", method = POST)
    public Domain addDomain(@RequestBody Domain domain) {
        return domainService.addDomain(domain);
    }
}
