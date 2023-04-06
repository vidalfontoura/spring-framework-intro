package com.plusgrade.di.main;

import com.plusgrade.di.config.MysqlConfig;
import com.plusgrade.di.config.PostgresConfig;
import com.plusgrade.di.dao.Dao;
import com.plusgrade.di.service.MyService;
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

