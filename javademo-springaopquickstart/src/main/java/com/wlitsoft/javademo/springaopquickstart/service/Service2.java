package com.wlitsoft.javademo.springaopquickstart.service;

import org.springframework.stereotype.Service;

/**
 * Created by Admin on 2017/6/15.
 */
@Service
public class Service2 extends ServiceBase {

    public Service2(){
        System.out.println("servce2 init");
    }

    @Override
    public void process() {
        System.out.println("service2 process");
    }
}
