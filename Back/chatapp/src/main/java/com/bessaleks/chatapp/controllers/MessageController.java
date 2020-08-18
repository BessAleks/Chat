package com.bessaleks.chatapp.controllers;

import com.bessaleks.chatapp.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    @Autowired
    private MessageRepository messageRepository;


}
