package com.wlitsoft.javademo.springrabbitmqquickstart;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

/**
 * Created by liliang on 2017/7/5.
 */
@Component
public class Queue1Listenter implements MessageListener {

    public void onMessage(Message message) {
        System.out.println(message.toString());
    }
}
