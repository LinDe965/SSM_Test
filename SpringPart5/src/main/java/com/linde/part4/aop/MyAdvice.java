package com.linde.part4.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    //匹配业务层的所有方法
    @Pointcut("execution(* com.linde.part4.service.*Service.*(..))")
    private void servicePointCut(){}

    @Around("MyAdvice.servicePointCut()")
    public Object runSpeed(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Signature signature = proceedingJoinPoint.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();

        Long start = System.currentTimeMillis();

        for (int i = 1; i <10000 ; i++) {
            proceedingJoinPoint.proceed();
        }

        Long end = System.currentTimeMillis();

        Long total = end - start;

        System.out.println("运行万次所耗时间: "+className+"."+methodName+"--->"+total+"ms ");

        return null;
    }
}

