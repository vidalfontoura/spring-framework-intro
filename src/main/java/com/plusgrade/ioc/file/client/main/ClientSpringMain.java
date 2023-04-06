package com.plusgrade.ioc.file.client.main;

import com.plusgrade.ioc.file.client.domain.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Loose Coupled Example within the Spring IoC Container.
 */
public class ClientSpringMain
{

  public static void main( String[] args )
  {
    ApplicationContext context = new ClassPathXmlApplicationContext( "application-context.xml" );

    Client client = context.getBean( Client.class);

    System.out.println(client);

  }
}
