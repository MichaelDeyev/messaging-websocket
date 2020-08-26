package com.example.messagingstompwebsocket.service;

import com.example.messagingstompwebsocket.model.OutputMessage;

public interface MessageService {
    void saveMessage(OutputMessage message);

    Iterable<OutputMessage> loadMessage();
}
