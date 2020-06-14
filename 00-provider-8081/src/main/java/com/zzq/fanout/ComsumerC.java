package com.zzq.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "q_fanout_C")
public class ComsumerC {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("q_fanout_C  : " + hello + "/n");
    }
}
