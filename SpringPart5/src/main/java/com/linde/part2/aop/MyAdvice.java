package com.linde.part2.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

//    @Pointcut("execution(void com.linde.part2.dao.BookDao.update())")
//    @Pointcut("execution(* com.*.*.*.*.update())")
//    @Pointcut("execution(void com.linde.part2.dao.impl.BookDaoImpl.update())")
//    @Pointcut("execution(* com.*.*.*.*.*.update())")
//    @Pointcut("execution(* *..*(..))")
//    @Pointcut("execution(* *..u*(..))")


   //@Pointcut("execution(* com.linde.*.*Service.find*(..))")
   @Pointcut("execution(* *..*e(..))")

    public void pointCut(){}

    @Before("pointCut()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }

}
