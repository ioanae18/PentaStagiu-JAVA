/*
Write a program that will test whether a string ends with another string

For example
Given the following strings “Hello java world” and “orld” the output should be TRUE

@author Ivan Emilia-Ioana

 */

package Exercitiul12;

import java.util.Scanner;

public class TwelfthEx
{
    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

        System.out.println("Your string is: ");
        String str1 = scan.nextLine();

        System.out.println("Your second string is: ");
        String str2 = scan.nextLine();

        System.out.println("Your string to check is: ");
        String end_str = scan.nextLine();

        //Check first two Strings end with end_str
        boolean ends1 = str1.endsWith(end_str);
        boolean ends2 = str2.endsWith(end_str);

        //Display the results of the endsWith calls.
        System.out.println("\"" + str1 + "\" ends with " +  "\"" + end_str + "\"? " + ends1);
        System.out.println("\"" + str2 + "\" ends with " + "\"" + end_str + "\"? " + ends2);
    }
}
