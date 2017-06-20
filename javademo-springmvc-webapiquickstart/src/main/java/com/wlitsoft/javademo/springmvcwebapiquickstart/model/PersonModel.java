package com.wlitsoft.javademo.springmvcwebapiquickstart.model;

/**
 * Created by liliang on 2017/3/27.
 */
public class PersonModel {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person[id:" + this.id + ",name:" + this.name + "]";
    }
}
