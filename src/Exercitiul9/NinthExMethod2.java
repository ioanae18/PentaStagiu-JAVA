/*
Write a Java program to find the number of even and odd integers in a given array of integers

For example.
Given the following array [13,20,14,5,2,8] the output should be:

Odd elements count : 2
Even elements count : 4

@author Ivan Emilia-Ioana
 */

package Exercitiul9;

import java.util.Scanner;

public class NinthExMethod2
{
    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

        System.out.print("The number of elements for first array: ");
        int n = scan.nextInt();
        System.out.print("The elements for first array is: ");
        int[] v = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("v[" + (i + 1) + "] = ");
            v[i] = scan.nextInt();
        }

        int nr = 0;
        for(int i = 0; i < n; i++)
        {
            if(v[i] % 2 == 0)
                nr++;
        }

        System.out.println ("The number of even integers: " + nr);
        System.out.println ("The number of odd integers: " + (v.length - nr));
    }
}
