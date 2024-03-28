package com.postponer.aimicroservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.postponer.aimicroservice.models.Request;

public interface RequestRepository extends MongoRepository<Request, String> {

}
