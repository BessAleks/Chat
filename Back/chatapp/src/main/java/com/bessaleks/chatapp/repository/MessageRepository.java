package com.bessaleks.chatapp.repository;

import com.bessaleks.chatapp.models.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository <Message,Long> {

}
