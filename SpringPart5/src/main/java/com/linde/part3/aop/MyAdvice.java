package com.linde.part3.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.linde.part3.dao.BookDao.update())")
    public void pointCutUpdate(){}
    @Pointcut("execution(* com.linde.part3.dao.BookDao.select())")
    public void pointCutSelect(){}

//    @Before("pointCutUpdate()")
    public void before(){
        System.out.println("before advice ...");
    }

    //@After("pointCutUpdate()")
    public void after(){
        System.out.println("after advice ...");
    }

    @Around("pointCutUpdate()")
    public void aroundUpdate(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before advice ...");
        //对原始操作的操作
        proceedingJoinPoint.proceed();

        System.out.println("around after advice ...");

    }

    //@Around("pointCutSelect()")
    public Object aroundSelect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before advice ...");
        //对原始操作的操作
        Integer proceed = (Integer)proceedingJoinPoint.proceed();

        System.out.println("around after advice ...");

        return proceed+566;
    }

//    @AfterReturning("pointCutSelect()")
    public void afterReturning(){
        System.out.println("afterReturning advice ...");
    }

//    @AfterReturning("pointCutSelect()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice ...");
    }


}
