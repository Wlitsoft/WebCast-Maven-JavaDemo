package com.wlitsoft.javademo.springaopquickstart;

import com.wlitsoft.javademo.springaopquickstart.service.Service1;
import com.wlitsoft.javademo.springaopquickstart.service.Service2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liliang on 2017/6/19.
 */
public class App {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:AppConfig.xml");

        Service1 service1 = (Service1) context.getBean("service1");
        service1.process();

        System.out.println("---------------------------------");

        Service2 service2 = (Service2)context.getBean("service2");
        service2.process();
    }
}
