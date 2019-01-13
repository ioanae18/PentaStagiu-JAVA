package com.pentalog.pentastagiu.ThingsPackage;

public class SmartRefrigerators implements ConnectableBluetooth
{
    String name;
    double price;
    int capacity;
    int size;
    String ledDisplay;
    String electricTemperatureControls;

    public SmartRefrigerators(String name, double price, int capacity, int size, String ledDisplay, String
            electricTemperatureControls) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.size = size;
        this.ledDisplay = ledDisplay;
        this.electricTemperatureControls = electricTemperatureControls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getLedDisplay() {
        return ledDisplay;
    }

    public void setLedDisplay(String ledDisplay) {
        this.ledDisplay = ledDisplay;
    }

    public String getElectricTemperatureControls() {
        return electricTemperatureControls;
    }

    public void setElectricTemperatureControls(String electricTemperatureControls) {
        this.electricTemperatureControls = electricTemperatureControls;
    }

    @Override
    public String toString() {
        return "SmartRefrigerators{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", capacity=" + capacity +
                ", size=" + size +
                ", ledDisplay='" + ledDisplay + '\'' +
                ", electricTemperatureControls='" + electricTemperatureControls + '\'' +
                '}';
    }

    public void printInfoToConsoleSR()
    {
        System.out.println("The info about refrigerator is: " + name + " " + price + " " + capacity + " " + size + " " +
                ledDisplay + " " + electricTemperatureControls);
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...");
    }
}
