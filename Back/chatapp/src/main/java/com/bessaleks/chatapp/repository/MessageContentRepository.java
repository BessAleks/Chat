package com.bessaleks.chatapp.repository;

import com.bessaleks.chatapp.models.MessageContent;
import org.springframework.data.repository.CrudRepository;

public interface MessageContentRepository extends CrudRepository<MessageContent,Long> {
}
