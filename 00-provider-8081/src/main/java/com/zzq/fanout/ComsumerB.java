package com.zzq.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "q_fanout_B")
public class ComsumerB {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("q_fanout_B  : " + hello + "/n");
    }
}
