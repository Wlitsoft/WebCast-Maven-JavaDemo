package com.wlitsoft.javademo.springquickstart;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liliang on 2017/3/27.
 */
public class PersonDAOTest extends TestBase {

    @Autowired
    private PersonDAO _personDao;

    @org.junit.Test
    public void sayHelloTest(){
        this._personDao.sayHello();
    }
}
