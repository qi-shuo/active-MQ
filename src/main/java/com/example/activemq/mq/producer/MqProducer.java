package com.example.activemq.mq.producer;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2018/11/10 7:20 PM
 */
@Component
public class MqProducer {
    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;


    public void testMq(String queueName,String message){
        jmsMessagingTemplate.convertAndSend(queueName,message);
    }
}
