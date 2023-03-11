package com.linde.part1.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.linde.part1.dao.BookDao.*d*(..))")
    private void pointCut(){}

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("=====================");
        Long startTime = System.currentTimeMillis();

        for (int i = 0;i < 10000;i++){
            proceedingJoinPoint.proceed();
        }

        Long endTime = System.currentTimeMillis();

        Long totalTime = endTime - startTime;

        System.out.println("执行万次消耗的时间："+totalTime+"ms");

        return  null;
    }
}
