package com.pentalog.pentastagiu.ThingsPackage;

public class Phone implements ConnectableBluetooth
{
    String name;
    String color;
    double price;
    int storage;
    int batteryCapacity;
    int cameraPixels;
    int processorPower;
    int screenSize;

    public Phone(String name, String color, double price, int storage, int batteryCapacity, int cameraPixels,
                 int processorPower, int screenSize) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.storage = storage;
        this.batteryCapacity = batteryCapacity;
        this.cameraPixels = cameraPixels;
        this.processorPower = processorPower;
        this.screenSize = screenSize;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getCameraPixels() {
        return cameraPixels;
    }

    public void setCameraPixels(int cameraPixels) {
        this.cameraPixels = cameraPixels;
    }

    public int getProcessorPower() {
        return processorPower;
    }

    public void setProcessorPower(int processorPower) {
        this.processorPower = processorPower;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                ", batteryCapacity=" + batteryCapacity +
                ", cameraPixels=" + cameraPixels +
                ", processorPower=" + processorPower +
                ", screenSize=" + screenSize +
                '}';
    }

    public void printInfoToConsoleP()
    {
        System.out.println("The info about phone is: " + name + " " + color + " " + price + " " + storage + " "
                + batteryCapacity + " " + cameraPixels + " " + processorPower + " " + screenSize);
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...");
    }

}
