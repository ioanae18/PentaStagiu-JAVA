/*
Write a program that will count how many times a character appears in a String

For example
Given the string “Hello java world” and the target character ‘a’ the output should be 2
(since ‘a’ appears twice in “Hello java world”)

@author Ivan Emilia-Ioana

 */
package Exercitiul11;

import java.util.Scanner;

public class EleventhEx
{
    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

        System.out.println("Enter your string: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println("Enter the target character: ");
        char a = scan.next().charAt(0);

        System.out.println(countChar(str, a));
    }

    public static int countChar(String str, char c)
    {
        int count = 0;

        for(int i=0; i < str.length(); i++)
        {
            if(str.charAt(i) == c)
               count++;
        }

        return count;
    }
}
