package com.app.service;

import java.util.List;

import com.app.exception.ChatException;
import com.app.exception.MessageException;
import com.app.exception.UserException;
import com.app.modal.Message;
import com.app.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}
