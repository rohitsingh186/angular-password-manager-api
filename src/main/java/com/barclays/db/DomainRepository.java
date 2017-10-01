/**
 * File: DomainRepository
 * Created by Rohit Singh on 01-10-2017.
 */

package com.barclays.db;

import com.barclays.domain.Domain;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DomainRepository extends MongoRepository<Domain, String> {

    public Domain findById(String id);

    public List<Domain> findByName(String name);
}