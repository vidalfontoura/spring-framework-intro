package com.plusgrade.ioc.file.account.domain;

public interface Account
{
  void deposit(double amount);

  void withdraw(double amount);

  double getBalance();
}
