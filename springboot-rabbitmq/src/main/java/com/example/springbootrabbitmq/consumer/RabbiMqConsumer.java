package com.example.springbootrabbitmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbiMqConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbiMqConsumer.class);


    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void consume(String message){
        LOGGER.info(String.format("Recevied message ->%s", message));

    }
}
