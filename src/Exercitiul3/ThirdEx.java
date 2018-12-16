/*
Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
For an input of x = 20 the output should be:

The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5

@author Ivan Emilia-Ioana

 */

package Exercitiul3;
import java.util.Scanner;

public class ThirdEx {

    private static Scanner scan;

    public static long Fibonacci(int n) {
        if (n <= 1) return n;
        else return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.println("The input n is: ");
        int n = scan.nextInt();
        int sum = 0;
        float average = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + Fibonacci(i));
            sum += i;
            average = (float) sum / 2;
        }

        System.out.println("The average is: " + average);
    }
}
