package com.zzq.rabbitMq;

import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "q_hello")
public class Consumer {

    @RabbitHandler
    public void process1(String hello) {
        System.out.println("Consumer:" + hello);
    }
}
