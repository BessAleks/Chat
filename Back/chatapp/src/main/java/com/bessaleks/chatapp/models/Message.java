package com.bessaleks.chatapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date messageDate;
    private Long messageFrom;
    private Long messageTo;

    public Message(){
    }

    public Message(Long messageFrom, Long messageTo) {
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
        this.messageDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public Long getMessageFrom() {
        return messageFrom;
    }

    public void setMessageFrom(Long messageFrom) {
        this.messageFrom = messageFrom;
    }

    public Long getMessageTo() {
        return messageTo;
    }

    public void setMessageTo(Long messageTo) {
        this.messageTo = messageTo;
    }
}
