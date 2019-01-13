/*

Write a java program that will return the min, max and average values in a given array.

For example
GIven the following array [13,20,14,5,2,8] the output should be
Max : 20
Min : 2
Average: 10.3

@author Ivan Emilia-Ioana

 */

package Exercitiul7;

import java.util.Scanner;

public class SeventhEx
{
    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

        System.out.print("The number of elements for array: ");
        int n = scan.nextInt();
        System.out.print("The elements for array is: ");
        int[] v = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("v[" + (i + 1) + "] = ");
            v[i] = scan.nextInt();
        }

        System.out.println("minimum = " + min(v));
        System.out.println("maximum = " + max(v));
        System.out.println("average = " + avg(v));
    }

    public static int min(int[] v)
    {
        int min = v[0];

        for (int i = 1; i < v.length; i++)
        {
            if (v[i] < min)
            {
                min = v[i];
            }
        }

        return min;
    }

    public static int max(int[] v)
    {
        int max = v[0];

        for (int i = 1; i < v.length; i++)
        {
            if (v[i] > max)
            {
                max = v[i];
            }
        }

        return max;
    }

    public static double avg(int[] vect)
    {
        int sum = 0;

        for (int i = 0; i < vect.length; i++)
        {
            sum += vect[i];
        }

        return (double)(sum / vect.length);
    }
}
