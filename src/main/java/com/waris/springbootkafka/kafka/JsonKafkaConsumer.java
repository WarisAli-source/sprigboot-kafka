package com.waris.springbootkafka.kafka;

import com.waris.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    public static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "waris-topic-11" ,groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Message received %s",user.toString()));
    }
}
