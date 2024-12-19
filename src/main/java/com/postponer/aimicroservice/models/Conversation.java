package com.postponer.aimicroservice.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "conversations")
@Data
@NoArgsConstructor
public class Conversation {
	
	@Id
    private String id;
    private String chatId;
    private List<Message> messages;

}
