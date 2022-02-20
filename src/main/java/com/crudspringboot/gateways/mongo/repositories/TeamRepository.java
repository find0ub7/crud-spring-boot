package com.crudspringboot.gateways.mongo.repositories;

import com.crudspringboot.gateways.mongo.documents.TeamDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<TeamDoc, String> {
    //query method
    boolean existsByName(String name);
}
