package com.plusgrade.ioc.file.account.domain;

public class SavingsAccountImpl
  implements Account
{
    private double balance;
    private double interestRate;

    public void deposit(double amount)
    {
      double interestEarned = (balance + amount) * interestRate;
      balance += amount + interestEarned;
    }

    public void withdraw(double amount)
    {
      if (balance - amount >= 0) {
        balance -= amount;
      } else {
        System.out.println("Insufficient funds!");
      }
    }

    public double getBalance() {
      return balance;
    }

    public void setBalance( double balance )
    {
      this.balance = balance;
    }

    public double getInterestRate()
    {
      return interestRate;
    }

    public void setInterestRate( double interestRate )
    {
      this.interestRate = interestRate;
    }
}
