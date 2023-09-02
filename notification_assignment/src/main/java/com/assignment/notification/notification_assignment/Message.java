package com.assignment.notification.notification_assignment;

import org.springframework.stereotype.Component;
/*
    TODO:
    Annotate this message as @Component
*/

@Component // annotated to make this a bean
public class Message {
    // attributes
    String to;
    String message;

    // getter for to
    public String getTo() {
        return this.to;
    }

    // setter for to
    public void setTo(String to) {
        this.to = to;
    }

    // getter for message
    public String getMessage() {
        return this.message;
    }

    // setter for message
    public void setMessage(String message) {
        this.message = message;
    }
}
