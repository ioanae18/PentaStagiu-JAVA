/*
Write a program to test whether a given string is a palindrome or not

For example
Given the following string “aaabccbaaa” should return TRUE
Given the following string “abccbb” should return FALSE

@author Ivan Emilia-Ioana

 */

package Exercitiul15;

import java.util.Scanner;

public class FifteenthEx
{
    public static Scanner scan;

    public static void main(String args[])
    {
        String str1, str2 = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        str1 = scan.nextLine();
        int n = str1.length();
        for(int i = n - 1; i >= 0; i--)
        {
            str2 = str2 + str1.charAt(i);
        }
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}
