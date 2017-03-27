package com.wlitsoft.javademo.springquickstart;

import org.springframework.stereotype.Component;

/**
 * Created by liliang on 2017/3/27.
 */
@Component
public class PersonModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello " + this.getName();
    }
}
