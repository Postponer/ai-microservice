package com.postponer.aimicroservice.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.postponer.aimicroservice.enums.Role;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "requests")
@Data
@NoArgsConstructor
public class Request {
	
	@Id
    private String id;
	private String model;
	private List<Message> messages;
	
	public Request(String model, String prompt) {
		this.model = model;
		this.messages = new ArrayList<>();
		this.messages.add(new Message(Role.USER.toString().toLowerCase(), prompt));
	}

}
