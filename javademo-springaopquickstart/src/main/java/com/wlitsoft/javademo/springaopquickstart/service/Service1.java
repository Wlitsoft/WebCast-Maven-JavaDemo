package com.wlitsoft.javademo.springaopquickstart.service;

import org.springframework.stereotype.Service;

/**
 * Created by Admin on 2017/6/15.
 */
@Service
public class Service1 extends ServiceBase {

    public Service1(){
        System.out.println("servce1 init");
    }

    @Override
    public void process() {
        System.out.println("service1 process");
    }
}
