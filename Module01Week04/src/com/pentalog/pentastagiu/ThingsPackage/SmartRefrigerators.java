package com.pentalog.pentastagiu.ThingsPackage;

public class SmartRefrigerators implements ConnectableBluetooth
{
    String name;
    double price;
    int capacity;
    int size;
    boolean ledDisplay;
    boolean electricTemperatureControls;

    @Override
    public String connectToBluetooth() {
        return "Connect to bluetooth in progress...";
    }
}
