package com.postponer.aimicroservice.dto;

import java.util.List;

import com.postponer.aimicroservice.models.Message;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestDTO {
	
	private String id;
	private String model;
	private List<Message> messages;

}
