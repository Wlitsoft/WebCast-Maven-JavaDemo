package com.wlitsoft.javademo.springquickstart;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liliang on 2017/3/27.
 */
public class PersonServiceTest extends TestBase {

    @Autowired
    private PersonService _personSerivce;

    @org.junit.Test
    public void sayHelloTest(){
        this._personSerivce.sayHello();
    }
}
