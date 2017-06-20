package com.wlitsoft.javademo.mybatisquickstart.mapper.javademo;

import com.wlitsoft.javademo.mybatisquickstart.mapper.BaseMapper;
import com.wlitsoft.javademo.mybatisquickstart.model.Person;

/**
 * Created by liliang on 2017/6/20.
 */
public interface PersonMapper extends BaseMapper {

    Person getById(Integer id);

    int getMaxId();

    int add(Person person);
}
