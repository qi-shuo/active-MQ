package com.example.activemq.mq.concumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2018/11/10 7:20 PM
 */
@Component
public class MqConsumer {

    @JmsListener(destination = "activemq.test")
    public void consumer(String data) {
        System.out.println(data);

    }
}
