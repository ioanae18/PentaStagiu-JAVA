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

    @Override
    public String connectToBluetooth() {
        return "Connect to bluetooth in progress...";
    }
}
