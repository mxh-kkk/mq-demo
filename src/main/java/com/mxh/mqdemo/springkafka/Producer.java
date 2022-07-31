package com.mxh.mqdemo.springkafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class Producer {
    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;
    // 读取配置文件
    @Value("${kafka.topic1}")
    private String topic;

    public void sendKafka() {
        kafkaTemplate.send(topic, "hell world");
    }
}