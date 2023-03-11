package com.linde.part5.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.linde.part5.dao.BookDao.findName(..))")
    public void pointCut(){}

   // @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ...");
    }

    //@After("pointCut()")
    public void after(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice ...");
    }

    //@Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 888;
        Object proceed = proceedingJoinPoint.proceed(args);
        return proceed;
    }

    @AfterReturning(value = "pointCut()",returning = "ret")
    public void afterReturning(Object ret){
        System.out.println("afterReturning advice ..."+ret);
    }

    public void afterThrowing(){
        System.out.println("afterThrowing advice ...");
    }

}
