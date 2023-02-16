package com.by.Aop;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class MyAop  {

    //定义切入点
    //* 代表的是一个单词
    //.. 通配符 ，代表的是0个或者多个匹配项 () 代表的是参数个数 ，(..)所有参数都匹配
    @Pointcut("execution(* com.by.*.*.*(..))")
    public void point(){

      }


      @Before("point()")
      public void before(){
        log.debug("前置通知");
      }


    @After("point()")
    public void after(){
        log.debug("后置通知");
    }



    @Around("point()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.debug("环绕前");
        Object value = joinPoint.proceed();
        log.debug("环绕后");
        return value;
    }

    @AfterReturning(value = "point()",returning = "returnValue")
    public void returning(Object returnValue){
        log.debug("目标正常返回结果-->{}",returnValue);
    }

    @AfterThrowing(value = "point()",throwing = "ex")
    public void throwing(Exception ex){
        log.debug("目标方法抛异常了,-->{}",ex.getMessage());
    }
}
