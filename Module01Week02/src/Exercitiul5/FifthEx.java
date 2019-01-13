/*

Write a program that test whether 2 int arrays are equal. Equality in this case means that both arrays have the same number of
elements an element on a specific index in first array is equal to the element on the same index in the second array.

For example

For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
For the following arrays [] and [] the output should be TRUE
For the following arrays [1,3,2] and [1,3] the output should be FALSE
For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE

@author Ivan Emilia-Ioana

 */

package Exercitiul5;
import java.util.Scanner;
import java.util.Arrays;

public class FifthEx
{

    private static Scanner scan;

    public static void main (String[] args)
    {
        scan = new Scanner(System.in);

        System.out.print("The elements for first array: ");
        int n = scan.nextInt();
        int[] v1 = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("v1[" + (i + 1) + "] = ");
            v1[i] = scan.nextInt();
        }

        System.out.print("The elements for second array: ");
        n = scan.nextInt();
        int[] v2 = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("v2[" + (i + 1) + "] = ");
            v2[i] = scan.nextInt();
        }

        System.out.println(arrayCompare(v1, v2));

    }

    public static boolean arrayCompare(int[] a1, int[] a2)
    {
        int[] array1 = a1;
        int[] array2 = a2;

        if(Arrays.equals(array1, array2))
        {
            return true;
        }
        return false;
    }
}
