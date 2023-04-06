package com.plusgrade.ioc.annotation.main;

import com.plusgrade.ioc.annotation.domain.Car;
import com.plusgrade.ioc.annotation.config.CarConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarMain
{
  public static void main(String[] args)
  {
    ApplicationContext context = new AnnotationConfigApplicationContext( CarConfig.class);

    Car car = context.getBean( Car.class);
    car.start();
  }
}
