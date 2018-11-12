package com.example.activemq.mq.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MqProducerTest {
    @Resource
    private MqProducer mqProducer;
    @Test
    public void testMq() {
        mqProducer.testMq("activemq.test","QiShuo");
    }
}