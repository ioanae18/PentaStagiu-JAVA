/*
Write a program that will insert a # between any duplicate letters that are placed right next to each.
For example

Given the following string “Hello world” the output should be “Hel#lo world”

@author Ivan Emilia-Ioana

 */
package Exercitiul14;

import java.util.Scanner;

public class FourteenthEx
{
    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

//        System.out.println("Your string is: ");
//        String str = scan.nextLine();

        StringBuffer sb = new StringBuffer("abcdefghijk");
        sb.insert(3, "#");
        System.out.println(sb);
    }

}
