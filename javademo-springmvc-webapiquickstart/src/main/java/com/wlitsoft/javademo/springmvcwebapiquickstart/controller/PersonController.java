package com.wlitsoft.javademo.springmvcwebapiquickstart.controller;

import com.wlitsoft.javademo.springmvcwebapiquickstart.model.PersonModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liliang on 2017/3/27.
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public String get(Integer id){
        if(id == null)
            return "empty";
        return "currId:" + id.toString();
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String add(PersonModel model){
        if(model !=null)
            return model.toString();
        return "empty";
    }
}
