/*
Create a console application from the following requirements:
In the application we will work with few things: cars, phones, smart refrigerators. Add some specific details for each one
We want each of these things to be able to connect with bluetooth → write a Connectable interface in which you specify this
contract: a method called connectToBluetooth
Add another simple class, Student for example, which doesn’t have to implement the Connectable interface
Implement this contract in each class that you have and add a specific implementation(in which you just print to console a
message in which you specify: “Connect to bluetooth in progress...” and the name of the device)

Scenario for testing:
Create an array of objects in which you add instances of each one of your objects(Car, Student, ….)
Iterate through the array and for each one print the message related to the connection to bluetooth (don’t forget to check what
 type of instance you have and to cast it to the appropriate type in order to make the call)

@author Ivan Emilia-Ioana
 */

package com.pentalog.pentastagiu;

import com.pentalog.pentastagiu.ThingsPackage.Car;
import com.pentalog.pentastagiu.ThingsPackage.Phone;
import com.pentalog.pentastagiu.ThingsPackage.SmartRefrigerators;

import java.util.ArrayList;

public class ThingsMain {
    public static void main(String[] args) {
//    ArrayList<Car> listCar = new ArrayList<Car>(2);
//    ArrayList<Phone> listPhone = new ArrayList<>(2);
//    ArrayList<SmartRefrigerators> listSmartRefrigerators = new ArrayList<>(2);
//    listCar.add("Audi", "red", "diesel", "4x4", "yes", "140", "13500");

        Car firstCar = new Car("Audi", "red", "diesel", "4x4", "yes", 140,
                13500);
        firstCar.printInfoToConsoleC();
        firstCar.connectToBluetooth();

        Phone firstPhone = new Phone("Huawei", "red", 350, 128, 3000, 24,
                100, 5);
        firstPhone.printInfoToConsoleP();
        firstPhone.connectToBluetooth();

        SmartRefrigerators firstSmartRefrigerators = new SmartRefrigerators("Electrolux", 400, 228,
                30, "yes", "yes");
        firstSmartRefrigerators.printInfoToConsoleSR();
        firstSmartRefrigerators.connectToBluetooth();
    }
}
