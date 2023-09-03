package com.assignment.notification.notification_assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    TODO:
    The channel of notification can be SMS or Email. 
    Set this class up a @Bean in the main class. Set the type to "SMS".
*/

@Configuration
public class Channel {
    // attribute
    String type;

    // empty constructor
    public Channel() {
    }

    // Use Channel class as a bean in the main class by annotating channelConfig()
    // with @Bean
    @Bean
    public Channel channelConfig() {
        // create an instance of channel
        Channel channelBean = new Channel();
        // set the type of the instance to SMS
        channelBean.setType("SMS");
        // return the instance
        return channelBean;
    }

    // getter
    public String getType() {
        return this.type;
    }

    // setter
    public void setType(String type) {
        this.type = type;
    }
}
