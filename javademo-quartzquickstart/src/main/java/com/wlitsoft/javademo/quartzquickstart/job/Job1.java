package com.wlitsoft.javademo.quartzquickstart.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * Created by liliang on 2017/6/21.
 */
public class Job1 implements Job {
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(jobExecutionContext.getJobDetail().getDescription() + " scheduledFireTime:" + jobExecutionContext.getScheduledFireTime());
    }
}