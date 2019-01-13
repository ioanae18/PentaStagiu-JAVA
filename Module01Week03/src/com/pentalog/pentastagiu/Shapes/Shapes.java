package com.pentalog.pentastagiu.Shapes;

public class Shapes
{
    private String name;
    private int length;
    private int width;
    private double radius;
    private double l1, l2, l3;
    private double base;
    private double high;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", radius=" + radius +
                ", l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                ", base=" + base +
                ", high=" + high +
                '}';
    }

    public void squareArea()
    {
        if (length > 0)
        {
            double area = Math.pow(length, 2);
            System.out.println("The area of the square is: " + area);
        }
    }

    public void squarePerimeter()
    {
        if (length > 0)
        {
            int perimeter = length*4;
            System.out.println("The perimeter of the square is: " + perimeter);
        }
    }


    public void rectangleArea()
    {
        if (length > 0 && width > 0)
        {
            double area = length*width;
            System.out.println("The area of the rectangle is: " + area);
        }
    }

    public void rectanglePerimeter()
    {
        if (length > 0 && width > 0)
        {
            double perimeter = 2*(length + width);
            System.out.println("The perimeter of the rectangle is: " + perimeter);
        }
    }

    public void circleArea()
    {
        double Pi = 3.14;
        if (radius > 0)
        {
            double area = Pi * Math.pow(radius,2);
            System.out.println("The area of the rectangle is: " + area);
        }
    }

    public void circlePerimeter()
    {
        double Pi = 3.14;
        if (radius > 0)
        {
            double perimeter = 2 * (Pi * radius);
            System.out.println("The perimeter of the rectangle is: " + perimeter);
        }
    }

    public void triangleArea()
    {
        if (base > 0 && high > 0)
        {
            double area = (base * high) / 2;
            System.out.println("The area of the rectangle is: " + area);
        }
    }

    public void trianglePerimeter()
    {
        if (l1 > 0 && l2 > 0 && l3 > 0)
        {
            double perimeter = l1 + l2 + l3;
            System.out.println("The perimeter of the rectangle is: " + perimeter);
        }
    }


}
