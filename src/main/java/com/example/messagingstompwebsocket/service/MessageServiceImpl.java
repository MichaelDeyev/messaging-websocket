package com.example.messagingstompwebsocket.service;

import com.example.messagingstompwebsocket.model.OutputMessage;
import com.example.messagingstompwebsocket.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageServiceImpl implements MessageService{


    @Autowired
    private MessageRepo messageRepo;

    @Override
    public void saveMessage(OutputMessage message) {
        messageRepo.save(message);
    }

    @Override
    public Iterable<OutputMessage> loadMessage() {
        return messageRepo.findAll();
    }
}
