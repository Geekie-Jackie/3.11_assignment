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

    // inject Channel and Mesage as dependencies over here using constructor method
    private Channel channel;
    private Message message;

    @Autowired
    public NotificationService(Channel channel, Message message) {
        this.channel = channel;
        this.message = message;
    }

    // a method named setup that uses message class's setter methods
    public void setup(String to, String textMessage) {
        this.message.setTo(to);
        this.message.setMessage(textMessage);
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

        // print out messageBuilder
        System.out.println(messageBuilder.toString());
    }

}