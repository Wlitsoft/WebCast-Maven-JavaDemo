package com.wlitsoft.javademo.springmvcwebapiquickstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liliang on 2017/3/27.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("sayHello")
    @ResponseBody
    public String sayHello(){
        return "Hello World";
    }
}
