package com.zzq.fanout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FanoutController {
    @Autowired
    private FanoutProducer producer;

    @RequestMapping("/mq/fanout")
    public void send1() throws Exception {
        producer.send();
    }
}
