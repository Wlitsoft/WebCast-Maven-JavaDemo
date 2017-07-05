package com.wlitsoft.javademo.springrabbitmqquickstart;

import com.wlitsoft.javademo.springrabbitmqquickstart.model.PersonModel;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liliang on 2017/7/5.
 */
public class MQProducerTest extends TestBase {

    @Autowired
    MQProducer mqProducer;

    @Test
    public void sendTest01(){
        PersonModel person = new PersonModel();
        person.setId(1);
        person.setName("wlit");
        person.setAge(20);
        person.setAddress("bj");
        this.mqProducer.sendDataToQueue("mq-exchage1","avc");
    }

}
