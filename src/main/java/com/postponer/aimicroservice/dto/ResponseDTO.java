package com.postponer.aimicroservice.dto;

import java.util.List;

import com.postponer.aimicroservice.models.Choice;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseDTO {
	
	private String id;
	private List<Choice> choices;

}
