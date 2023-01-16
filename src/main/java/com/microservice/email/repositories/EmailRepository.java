package com.microservice.email.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.email.entities.EmailModel;

public interface EmailRepository extends MongoRepository<EmailModel, Long> {

}
