package com.zzq.rabbitMq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController {
    @Autowired
    Producer producer;
    @RequestMapping("/mq")
    public void doSome() {
        producer.send("你好");
    }
}
