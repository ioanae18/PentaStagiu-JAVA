/*
Create a console application from the following requirements:
A bank account from where someone has the option to withdraw and deposit money
Write information to the console each time someone makes an operation on that account
Take into consideration any validations that have to be done since this is a debit account, so user can’t withdraw more than he has into
account. Display this information to inform the user about why the operation failed

@author Ivan Emilia-Ioana
 */
package com.pentalog.pentastagiu;

import java.text.NumberFormat;
import java.util.Scanner;

public class BankMain
{
    public Scanner scan;

    public static void main(String[] args)
    {
        Account checking = new Account();
        checking.setType("Checking");
        checking.setBalance(0.00);
        checking.setRate(0.00);

        Account savings = new Account();
        savings.setType("Savings");
        savings.setBalance(0.00);
        savings.setRate(2.00);

        NumberFormat formatt = NumberFormat.getCurrencyInstance();
        Scanner scan = new Scanner(System.in);

        boolean session = true;

        while (session)
        {
            System.out.println("Menu: \n"
                    + "1. Deposit money \n"
                    + "2. Withdraw money \n");

            int selection = scan.nextInt();
            switch (selection)
            {
                case 1:
                    System.out.println("Enter (1) for Savings or (2) for Checking: ");
                    int depositAccount = scan.nextInt();

                    if (depositAccount == 1)
                    {
                        System.out.println("\n Your current Savings balance is: " + formatt.format(savings.getBalance()) + "\n");

                        System.out.println("How much money would you like to deposit?");
                        double deposit = scan.nextDouble();

                        savings.deposit(deposit);

                        System.out.println("\n Your Savings balance is now: " + formatt.format(savings.getBalance()) + "\n");
                    }

                    if (depositAccount == 2)
                    {
                        System.out.println("\n Your current Savings balance is: " + formatt.format(savings.getBalance()) + "\n");

                        System.out.println("How much money would you like to deposit?");
                        double deposit = scan.nextDouble();

                        savings.deposit(deposit);

                        System.out.println("\n Your Savings balance is now: " + formatt.format(savings.getBalance()) + "\n");
                    }
                    break;

                case 2:
                    System.out.println("Enter (1) for Savings or (2) for Checking: ");
                    int withdrawAccount = scan.nextInt();

                    if (withdrawAccount == 1)
                    {
                        System.out.println("\n Your Savings balance is now: " + formatt.format(savings.getBalance()) + "\n");

                        System.out.println("How much would you like to withdraw?");
                        double withdraw = scan.nextDouble();

                        savings.withdraw(withdraw);

                        System.out.println("\n Your Savings balance is now: " + formatt.format(savings.getBalance()) + "\n");
                    }

                    else if (withdrawAccount == 2)
                    {
                        System.out.println("\n Your Savings balance is now: " + formatt.format(savings.getBalance()) + "\n");

                        System.out.println("How much money would you like to withdraw?");
                        double withdraw = scan.nextDouble();

                        checking.withdraw(withdraw);

                        System.out.println("\n Your Checking balance is now: " + formatt.format(checking.getBalance()) + "\n");
                    }
                    break;
            }

        }
    }
}
