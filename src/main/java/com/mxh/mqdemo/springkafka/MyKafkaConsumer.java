package com.mxh.mqdemo.springkafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class MyKafkaConsumer {
    @KafkaListener(topics = "${kafka.topic1}")
    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            log.info("----------------- record =" + record);
            log.info("------------------ message =" + kafkaMessage.get());
        }
    }
}