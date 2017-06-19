package com.wlitsoft.javademo.springaopquickstart.aspect;

import com.wlitsoft.javademo.springaopquickstart.service.ServiceBase;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 2017/6/15.
 */
@Component
@Aspect
public class ServiceAspect {

    //匹配 所有 ServiceBase 派生类的 process 方法。
    @Pointcut("execution(* com.wlitsoft.javademo.springaopquickstart.service.ServiceBase.process(..))")
    public void processAspect() {

    }

    /**
     * process 前置通知
     *
     * @param joinPoint
     */
    @Before("processAspect()")
    public void processBefore(JoinPoint joinPoint) {
        System.out.println("before_" + this.getClassName(joinPoint));
    }

    /**
     * process 后置通知
     *
     * @param joinPoint
     */
    @After("processAspect()")
    public void processAfter(JoinPoint joinPoint) {
        System.out.println("after_" + this.getClassName(joinPoint));
    }

    /**
     * process 环绕通知
     *
     * @param joinPoint
     */
    @Around("processAspect()")
    public void processAround(JoinPoint joinPoint) {
        long start = System.currentTimeMillis();
        try {
            ((ProceedingJoinPoint) joinPoint).proceed();
            long end = System.currentTimeMillis();
            System.out.println("around_" + this.getClassName(joinPoint) + "exct time:" + (end - start) + "ms");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /**
     * process 异常通知
     *
     * @param joinPoint
     * @param ex
     */
    @AfterThrowing(value = "processAspect()", throwing = "ex")
    public void processAfterThrowing(JoinPoint joinPoint, Exception ex) {
        System.out.println("throwing_" + this.getClassName(joinPoint));
    }

    private String getClassName(JoinPoint joinPoint) {
        ServiceBase service = (ServiceBase) joinPoint.getTarget();
        return service.getClass().getName();
    }
}
