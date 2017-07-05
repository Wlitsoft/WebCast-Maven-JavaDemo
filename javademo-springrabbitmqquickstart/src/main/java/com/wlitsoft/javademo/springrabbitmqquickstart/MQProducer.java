package com.wlitsoft.javademo.springrabbitmqquickstart;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liliang on 2017/7/5.
 */
@Service
public class MQProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void sendDataToQueue(String queueKey,Object object){
        this.amqpTemplate.convertAndSend(queueKey,object);
    }
}
