package com.postponer.aimicroservice.dto;

import java.util.List;

import com.postponer.aimicroservice.models.Message;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConversationDTO {

	private String id;
	private String chatId;
	private List<Message> messages;

}
