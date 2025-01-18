package com.erkinkubatov.springMVC_Hibernate_AOP.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class MyLoggingAspect {
    @Around("execution(* com.erkinkubatov.springMVC_Hibernate_AOP.dao.*.* (..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("Begin Method: " + method.getName());
        Object result = proceedingJoinPoint.proceed();
        System.out.println("End Method: " + method.getName());
        return result;
    }
}
