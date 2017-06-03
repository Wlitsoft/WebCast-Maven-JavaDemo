package com.wlitsoft.javademo.springtaskquickstart;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liliang on 2017/6/3.
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:AppConfig.xml");

        while (true){
            System.out.println("task is running");
            Thread.sleep(10000);
        }
    }
}
