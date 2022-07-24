package com.mxh.mqdemo.jms.controller;

import com.mxh.mqdemo.jms.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;

@RestController
public class ProducerController {

    // JMS 消息发送模版
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;

    // 发送Queue消息
    @GetMapping("/sendQueueMsg")
    public void sendQueueMsg(Book book) {
        this.jmsMessagingTemplate.convertAndSend(this.queue, book);
    }

    // 发送Topic消息
    @GetMapping("/sendTopicMsg")
    public void sendTopicMsg(Book book) {
        this.jmsMessagingTemplate.convertAndSend(this.topic, book);
    }
}
