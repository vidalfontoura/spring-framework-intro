package com.plusgrade.aop.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl
  implements MyService
{
  public void doSomething(String arg)
  {
    System.out.println("Doing something with arg: " + arg);
  }
}
