package com.zzq.rabbitMq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 生成者
 */
@Component
public class Producer {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    public void send(String content) {
        this.rabbitmqTemplate.convertAndSend("q_hello", content);
    }

}
