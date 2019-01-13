/*
Write a program that test if a given String contains another String.

For example
Given the following base String “Hello java world” and the target test String “java” the output should be TRUE

@author Ivan Emilia-Ioana

 */

package Exercitiul10;

import java.util.Scanner;

public class TenthEx
{

    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

        System.out.println("Enter your first string: ");
        String str1 = scan.nextLine();

        System.out.println("Enter your second string: ");
        String str2 = scan.nextLine();


        System.out.println("Original String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));
    }
}
