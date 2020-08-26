package com.example.messagingstompwebsocket.repos;

import com.example.messagingstompwebsocket.model.OutputMessage;
import org.springframework.data.repository.CrudRepository;


public interface MessageRepo extends CrudRepository<OutputMessage, Long>{

}
