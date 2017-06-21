package com.wlitsoft.javademo.quartzquickstart;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by liliang on 2017/6/21.
 */
public class App {

    public static void main(String[] args) {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        try {
            Scheduler scheduler = schedulerFactory.getScheduler();
            scheduler.start();
            System.out.println("quartz start...");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
