package com.plusgrade.ioc.annotation.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier( "gasEngine" )
public class GasEngineImpl
  implements Engine
{
  public void start()
  {
    System.out.println( "Starting gas engine" );
  }
}
