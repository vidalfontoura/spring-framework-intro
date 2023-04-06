package com.plusgrade.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect
{
  @Before("execution(* com.plusgrade.aop.service.*.*(..))")
  public void logBefore( JoinPoint joinPoint)
  {
    String methodName = joinPoint.getSignature().getName();
    System.out.println("Entering " + methodName);
  }

  @After("execution(* com.plusgrade.aop.service.*.*(..))")
  public void logAfter(JoinPoint joinPoint)
  {
    String methodName = joinPoint.getSignature().getName();
    System.out.println("Exiting " + methodName);
  }



}
