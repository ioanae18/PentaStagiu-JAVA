package com.pentalog.pentastagiu.ThingsPackage;

public class Car implements ConnectableBluetooth
{
    String name;
    String color;
    String combustible;
    String tractionControl;
    String airbags;
    int performance;
    double price;

    public Car(String name, String color, String combustible, String tractionControl, String airbags, int performance,
               double price) {
        this.name = name;
        this.color = color;
        this.combustible = combustible;
        this.tractionControl = tractionControl;
        this.airbags = airbags;
        this.performance = performance;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTractionControl() {
        return tractionControl;
    }

    public void setTractionControl(String tractionControl) {
        this.tractionControl = tractionControl;
    }

    public String getAirbags() {
        return airbags;
    }

    public void setAirbags(String airbags) {
        this.airbags = airbags;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", combustible='" + combustible + '\'' +
                ", tractionControl='" + tractionControl + '\'' +
                ", airbags='" + airbags + '\'' +
                ", performance=" + performance +
                ", price=" + price +
                '}';
    }

    public void printInfoToConsoleC()
    {
        System.out.println("The info about car is: " + name + " " + color + " " + combustible + " " + tractionControl + " " +
                airbags + " " + performance + " " + price);
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...");
    }
}
