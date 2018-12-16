/*

Write a java program to return the index of a target element.

For example:
Given  the following array [13,20,14,5,2,8] and a target element 5 the output should be : 3 (because 5 is located at index 3 in
the array)

@author Ivan Emilia-Ioana

 */

package Exercitiul8;

public class EighthEx
{

    public static void main(String[] args)
    {

        int[] v = { 13,20,14,5,2,8 };


        System.out.println("Index position of 5 is: " + findIndex(v, 5));

        System.out.println("Index position of 7 is: " + findIndex(v, 7));
    }

    public static int findIndex(int[] a, int target)
    {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;

        return -1;
    }
}
