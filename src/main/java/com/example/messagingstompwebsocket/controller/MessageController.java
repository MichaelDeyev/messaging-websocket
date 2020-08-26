package com.example.messagingstompwebsocket.controller;

import com.example.messagingstompwebsocket.model.InputMessage;
import com.example.messagingstompwebsocket.model.OutputMessage;
import com.example.messagingstompwebsocket.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;


@Controller
public class MessageController {

	@Autowired
	MessageRepo messageRepo;

	@MessageMapping("/hello") // if MSG go to "/hello", the "greetings" method will be done
	@SendTo("/topic/greetings") // generated MSG sends to all users, who subscribe the "/topic/greetings"
	public OutputMessage greeting(@Payload InputMessage message){
		OutputMessage outputMessage = new OutputMessage(HtmlUtils.htmlEscape(message.getContent()));
		messageRepo.save(outputMessage);
		return outputMessage;
	}
}
