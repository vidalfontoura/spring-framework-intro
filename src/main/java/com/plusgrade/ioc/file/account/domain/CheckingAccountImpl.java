package com.plusgrade.ioc.file.account.domain;

public class CheckingAccountImpl implements Account
{
  private double balance;

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  public double getBalance() {
    return balance;
  }
}
