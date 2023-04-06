package com.plusgrade.ioc.annotation.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier( "electricEngine" )
public class ElectricEngineImpl
  implements Engine
{
  public void start()
  {
    System.out.println( "Starting electric engine" );
  }
}
