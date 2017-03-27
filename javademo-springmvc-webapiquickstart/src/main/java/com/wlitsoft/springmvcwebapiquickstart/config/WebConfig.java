package com.wlitsoft.springmvcwebapiquickstart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by liliang on 2017/3/27.
 * web 配置类，暂时只配置 启用 mvc 、spring 扫描包等
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.wlitsoft.springmvcwebapiquickstart")
public class WebConfig extends WebMvcConfigurerAdapter {

}
