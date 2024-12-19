package com.postponer.aimicroservice.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "responses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
	
	@Id
    private String id;
	private List<Choice> choices;

}
