package com.mxh.mqdemo.jms.consumer;

import com.mxh.mqdemo.jms.dto.Book;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    // 监听和读取queue消息
    @JmsListener(destination = "amq.queue")
    public void readActiveQueue(Book book) {
        System.out.println("接收到queue消息：" + book);
    }

    // 监听和读取topic消息
    @JmsListener(destination = "amq.topic")
    public void readActiveTopic(Book book) {
        System.out.println("接收到topic消息：" + book);
    }
}

