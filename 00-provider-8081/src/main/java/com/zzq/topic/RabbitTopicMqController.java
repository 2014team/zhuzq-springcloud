package com.zzq.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitTopicMqController {
    @Autowired
    TopicProducer producer;

    @RequestMapping("/mq/topic/send1")
    public void send1() {
        producer.send1();
    }
    @RequestMapping("/mq/topic/send2")
    public void send2() {
        producer.send2();
    }
}
