package com.postponer.aimicroservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.postponer.aimicroservice.models.Response;

public interface ResponseRepository extends MongoRepository<Response, String>{

}
