package com.assignment.notification.notification_assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChannelConfig {

    @Bean
    public Channel createChannelBean() {
        Channel channelBean = new Channel();
        channelBean.setType("SMS");
        return channelBean;
    }
}