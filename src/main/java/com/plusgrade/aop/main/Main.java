package com.plusgrade.aop.main;

import com.plusgrade.aop.config.AspectConfig;
import com.plusgrade.aop.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
  public static void main(String[] args)
  {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( AspectConfig.class );

    MyService myService = context.getBean( MyService.class);

    myService.doSomething("test");

    context.close();
  }
}
