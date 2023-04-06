package com.plusgrade.aop.config;

import com.plusgrade.aop.aspects.LoggingAspect;
import com.plusgrade.aop.service.MyService;
import com.plusgrade.aop.service.MyServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig
{
  @Bean
  public MyService myService()
  {
    return new MyServiceImpl();
  }

  @Bean
  public LoggingAspect loggingAspect()
  {
    return new LoggingAspect();
  }
}

