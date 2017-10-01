package com.barclays.service;

import com.barclays.db.DomainRepository;
import com.barclays.domain.Domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.isNull;
import static java.util.UUID.randomUUID;

@Service
public class DomainService {

    private DomainRepository repository;

    @Autowired
    public DomainService(DomainRepository repository) {
        this.repository = repository;
        initializeSomeDomainData();
    }

    public List<Domain> getDomains() {
        return repository.findAll();
    }

    public Domain addDomain(Domain domain) {
        if (isNull(repository.findById(domain.getId()))) {
            domain.setId(randomUUID().toString());
        }
        return repository.save(domain);
    }

    private void initializeSomeDomainData() {
        Domain domain = new Domain();
        domain.setId("1");
        domain.setName("Gmail");
        domain.setUserName("abc.com");
        domain.setPassword("Qwerty@123");

        repository.save(domain);

        domain = new Domain();
        domain.setId("2");
        domain.setName("Facebook");
        domain.setUserName("fgh@gmail.com");
        domain.setPassword("Qwerty@123");

        repository.save(domain);

        domain = new Domain();
        domain.setId("3");
        domain.setName("Pied Piper");
        domain.setUserName("piedp@piedpiper.com");
        domain.setPassword("Qwerty@123");

        repository.save(domain);
    }
}
