package com.plusgrade.ioc.file.account.service;

import com.plusgrade.ioc.file.account.domain.Account;

import java.util.Map;

public class AccountService
{
  private Map<String, Account> accountMap;

  public void setAccountMap(Map<String, Account> accountMap)
  {
    this.accountMap = accountMap;
  }

  public void doAccountTransactions()
  {
    Account checkingAccount = accountMap.get( "checking");
    checkingAccount.deposit(100.0);
    checkingAccount.withdraw(50.0);


    System.out.println("Checking balance: " + checkingAccount.getBalance());

    Account savingsAccount = accountMap.get("savings");
    savingsAccount.deposit(200.0);
    savingsAccount.withdraw(250.0);

    System.out.println("Savings balance: " + savingsAccount.getBalance());
  }
}



