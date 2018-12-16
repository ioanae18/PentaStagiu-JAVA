/*

Write a java program that will test whether the first and the last element of an int array are the same. We can assume the array
has 2 or more elements.

For example:
For the following input [13,6,2,8,2,3] the output should be : FALSE
For the following input [13,6,2,8,2,13] the output should be : TRUE

@author Ivan Emilia-Ioana

 */

package Exercitiul4;
import java.util.Scanner;

public class FourthEx {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.print("The number of the elements is: ");
        int n = scan.nextInt();
        System.out.print("The array is: ");
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("v[" + (i + 1) + "] = ");
            v[i] = scan.nextInt();
        }

        int ok = 0;
        int arrayLength = v.length;
        int x1 = v[0];
        int x2 = v[arrayLength - 1];
        for (int i = 1; i <= n; i++) {
            if (x1 == x2)
            {
                ok = 1;
                break;
            }
        }

        if(ok == 0)
            System.out.print("FALSE");
        else
            System.out.print("TRUE");
    }
}
