/*
Create an application that knows how to calculate the perimeter and area for common shapes(circle, square, rectangle, triangle)
To test it: create few objects of each type and print to the console informations about the object that has the biggest area

@author Ivan Emilia-Ioana
 */
package com.pentalog.pentastagiu;

import com.pentalog.pentastagiu.Shapes.Shapes;

import java.util.Scanner;

public class ShapesMain
{
    public static Scanner scan;

    public static void main(String[] args)
    {
        Shapes firstShape = new Shapes();
        firstShape.setName("Square");
        firstShape.setLength(8);
        firstShape.setWidth(9);
        System.out.println(firstShape.toString());
        firstShape.squareArea();
        firstShape.squarePerimeter();

        Shapes secondShape = new Shapes();
        secondShape.setName("Rectangle");
        secondShape.setLength(10);
        secondShape.setWidth(15);
        System.out.println(secondShape.toString());
        secondShape.rectangleArea();
        secondShape.rectanglePerimeter();

        Shapes thirdShape = new Shapes();
        thirdShape.setName("Circle");
        thirdShape.setRadius(5.6);
        System.out.println(thirdShape.toString());
        thirdShape.circleArea();
        thirdShape.circlePerimeter();

        Shapes fourthShape = new Shapes();
        fourthShape.setName("Triangle");
        fourthShape.setL1(4.1);
        fourthShape.setL2(6.8);
        fourthShape.setL3(3.1);
        fourthShape.setBase(5.0);
        fourthShape.setHigh(2.0);
        System.out.println(fourthShape.toString());
        fourthShape.triangleArea();
        fourthShape.trianglePerimeter();

//        String secondShape;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the name of the shape you want to check: ");
//        secondShape = scan.nextLine();
//        System.out.print("Enter the length: ");
//        secondShape = scan.nextLine();
//        System.out.print("Enter the width: ");
//        secondShape = scan.nextLine();
//        System.out.print("Enter the radius: ");
//        secondShape = scan.nextLine();
//        System.out.print("Enter the l1: ");
//        secondShape = scan.nextLine();
//        System.out.print("Enter the l2: ");
//        secondShape = scan.nextLine();
//        System.out.print("Enter the l3: ");
//        secondShape = scan.nextLine();
//        System.out.print("Enter the base: ");
//        secondShape = scan.nextLine();
//        System.out.print("Enter the high: ");
//        secondShape = scan.nextLine();
//        System.out.println(secondShape.toString());
//
//        secondShape.squareArea();
//        secondShape.squarePerimeter();
//        secondShape.rectangleArea();
//        secondShape.rectanglePerimeter();
//        secondShape.circleArea();
//        secondShape.circlePerimeter();
//        secondShape.triangleArea();
//        secondShape.trianglePerimeter();


    }
}
