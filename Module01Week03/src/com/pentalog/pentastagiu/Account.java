package com.pentalog.pentastagiu;

public class Account
{
    public String type;
    public double balance;
    public double rate;

    public Account(String type, double balance, double rate) {
        this.type = type;
        this.balance = balance;
        this.rate = rate;
    }

    public Account()
    {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    void deposit(double depositAmount)
    {
            balance += depositAmount;
    }

    public boolean withdraw(double withdrawAmount)
    {
        if (withdrawAmount > balance){
            System.out.println("Insufficient Funds!");
            return false;
        } else {
            balance -= withdrawAmount;
            return true;
        }
    }


//    public void Account (double Balance){
//        if (balance < 0)
//        {
//             throw new IllegalArgumentException("Balance cannot be negative");
//        }
//     balance = Balance;
//   }
}

