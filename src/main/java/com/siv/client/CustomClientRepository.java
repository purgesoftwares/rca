package com.siv.client;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomClientRepository extends CrudRepository<CustomClientDetail, String>, MongoRepository<CustomClientDetail, String> {

}
