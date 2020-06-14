package com.zzq.topic;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "q_topic_message")
public class Consumer1 {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Consumer1  : " + hello);
    }
}
