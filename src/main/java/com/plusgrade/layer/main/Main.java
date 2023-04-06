package com.plusgrade.layer.main;

import com.plusgrade.layer.config.MysqlConfig;
import com.plusgrade.layer.config.PostgresConfig;
import com.plusgrade.layer.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
  public static void main(String[] args)
  {
    try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext())
    {
      context.register( PostgresConfig.class, MysqlConfig.class);
      context.scan("com.plusgrade.di.service" );
      context.refresh();

      MyService service = context.getBean( MyService.class);

      service.doSomething( "arg" );

    }
  }
}

