package com.pentalog.pentastagiu.ThingsPackage;

public class Car implements ConnectableBluetooth
{
    String name;
    String color;
    String combustible;
    String tractionControl;
    int performance;
    double price;
    boolean airbags;

    @Override
    public String connectToBluetooth() {
        return "Connect to bluetooth in progress...";
    }
}
