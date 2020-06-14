package com.zzq.topic;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "q_topic_messages")
public class Consumer2 {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Consumer2  : " + hello);
    }
}
