package com.wlitsoft.javademo.springtaskquickstart.jobs;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by liliang on 2017/6/3.
 */
@Component
public class Job1 {

    @Scheduled(cron = "0/1 * * * * ?")
    public void process(){
        System.out.println("job1 process currTime:" + new Date().getTime());
    }
}
