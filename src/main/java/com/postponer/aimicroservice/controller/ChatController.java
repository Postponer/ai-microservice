package com.postponer.aimicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.postponer.aimicroservice.models.Request;
import com.postponer.aimicroservice.models.Response;

@RestController
@RequestMapping("/api/v1")
public class ChatController {
	
	@Autowired
	private RestTemplate template;
	
	@Value("${spring.ai.openai.chat.base-url}")
	private String apiUrl;
	
	@GetMapping("/chat")
	public String getResponse(@RequestParam("model") String model, @RequestParam("prompt") String prompt) {
		
		Request request = new Request(model, prompt);
		Response response = template.postForObject(apiUrl, request, Response.class);
		return response.getChoices().get(0).getMessage().getContent();
	}

}
