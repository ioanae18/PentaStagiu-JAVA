/*
Write a program that will return a different string representing the alphabet index of each letter.

Assuming we have the following alphabet encoding

a = 0
b = 1
c = 2
d = 3
…

For the given string “abcd” the output should be “0123”

@author Ivan Emilia-Ioana

 */

package Exercitiul13;

import java.util.Scanner;

public class ThirteenthEx
{

    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

        System.out.println("Your string is: ");
        String str = scan.nextLine();

        char letter;
        for(int i=0; i<str.length(); i++)
        {
            letter = str.charAt(i);
            if(letter >= 'A' && letter <= 'Z')
                System.out.println((int)letter - 'A' + 1);
            if(letter >= 'a' && letter <= 'z')
                System.out.println((int)letter - 'a' + 1);
        }
    }
}
