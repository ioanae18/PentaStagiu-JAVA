/*

Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
For example, for range numbers 1 to 100 output should be:

Sum for range 1 to 100 : 5050
Average for range 1 to 100 : 50.5

@author Ivan Emilia-Ioana

 */

package Exercitiul2;
import java.util.Scanner;

public class SecondEx {

    private static Scanner scan;

    public static void main (String[] args)
    {
        scan = new Scanner(System.in);

        int minVariable;
        int targetVariable;

        System.out.print("My first variable is: ");
        minVariable = scan.nextInt();
        System.out.print("My target variable is: ");
        targetVariable = scan.nextInt();

        int sum = 0;
        float average = 0;
        for ( int i = minVariable; i <= targetVariable; i++)
        {
            sum += i;
            average = (float)targetVariable/2;
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);
    }
}
