package com.mxh.mqdemo.jms.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;

@Configuration
public class JmsConfig {

    // Queue模式下的Destination
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("amq.queue");
    }

    // Topic模式下的Destination
    @Bean
    public Topic topic(){
        return new ActiveMQTopic("amq.topic");
    }
}

