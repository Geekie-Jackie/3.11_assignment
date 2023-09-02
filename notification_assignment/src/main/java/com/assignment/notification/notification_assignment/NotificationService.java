package com.assignment.notification.notification_assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
    TODO:
    - Annotate this class with @Component
    - Inject the Channel and Message instance using @Autowired
*/

@Component
public class NotificationService {

    @Autowired // added this annotation to inject instance here
    Channel channel;

    @Autowired // added this annotation to inject instance here
    Message message;

    // a method named setup that uses message class's setter methods
    public void setup(String to, String message) {
        message.setTo(to);
        message.setMessage(message);
    }

    // a method named send that create StringBuilder object called messageBuilder 
    public void send() {
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("To:");
        messageBuilder.append(this.message.getTo());
        messageBuilder.append("\nMessage:");
        messageBuilder.append(this.message.getMessage());
        messageBuilder.append("\nChannel:");
        messageBuilder.append(this.channel.getType());
    }
}