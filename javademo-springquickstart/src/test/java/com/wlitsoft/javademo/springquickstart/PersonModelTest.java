package com.wlitsoft.javademo.springquickstart;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liliang on 2017/3/27.
 */
public class PersonModelTest extends TestBase {

    @Autowired
    private PersonModel _personModel;

    @org.junit.Test
    public void test(){
        this._personModel.setName("wlitsoft");
        String result = this._personModel.toString();

        System.out.println(result);
        Assert.assertEquals("Hello wlitsoft",result);
    }
}
