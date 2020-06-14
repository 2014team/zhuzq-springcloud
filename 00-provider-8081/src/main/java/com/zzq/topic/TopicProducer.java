package com.zzq.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 生成者
 */
@Component
public class TopicProducer {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    public void send1() {
        String context = "hi, i am message 1";
        System.out.println("Producer : " + context);
        this.rabbitmqTemplate.convertAndSend("myexchange", "topic.message", context);
    }


    public void send2() {
        String context = "hi, i am messages 2";
        System.out.println("Producer : " + context);
        this.rabbitmqTemplate.convertAndSend("myexchange", "topic.messages", context);
    }


}
