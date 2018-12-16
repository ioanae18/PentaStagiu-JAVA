/*

Write a java program that will concatenate 2 arrays.
For example
Given 2 arrays [1,2,3,4] and [5,6,7,8] the output should be a new array containing [1,2,3,4,5,6,7,8]

@author Ivan Emilia-Ioana

*/

package Exercitiul6;
import java.util.Scanner;
import java.util.Arrays;

public class SixthExMethod2
{

    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

        System.out.print("The number of elements for first array: ");
        int n = scan.nextInt();
        System.out.print("The elements for first array is: ");
        int[] v1 = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("v1[" + (i + 1) + "] = ");
            v1[i] = scan.nextInt();
        }

        System.out.print("The number of elements for second array: ");
        n = scan.nextInt();
        System.out.print("The elements for second array is: ");
        int[] v2 = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("v2[" + (i + 1) + "] = ");
            v2[i] = scan.nextInt();
        }

        int combined[] = new int[v1.length + v2.length];

        for (int i = 0; i < v1.length; i++)
        {
            combined[i] = v1[i];
        }

        for ( int i = 0; i < v2.length; i++)
        {
            combined[v1.length + i] = v2[i];
        }

        System.out.println(Arrays.toString(combined));
    }
}
