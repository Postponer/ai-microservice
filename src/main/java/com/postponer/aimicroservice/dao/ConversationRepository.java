package com.postponer.aimicroservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.postponer.aimicroservice.models.Conversation;

public interface ConversationRepository extends MongoRepository<Conversation, String>{

}