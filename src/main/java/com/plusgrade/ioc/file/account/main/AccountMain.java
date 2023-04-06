package com.plusgrade.ioc.file.account.main;

import com.plusgrade.ioc.file.account.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountMain
{

  public static void main( String[] args )
  {
    ApplicationContext context = new ClassPathXmlApplicationContext( "application-context.xml" );
    AccountService accountService = (AccountService) context.getBean( "accountService");
    accountService.doAccountTransactions();
  }

}
