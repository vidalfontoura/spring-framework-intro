package com.plusgrade.ioc.annotation.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car
{
  private Engine engine;

  @Autowired
  public Car(@Qualifier("gasEngine") Engine engine)
  {
    this.engine = engine;
  }

  public void start()
  {
    engine.start();
  }
}
