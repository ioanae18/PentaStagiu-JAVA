package com.pentalog.pentastagiu.RestaurantPackage;

public class FastFoodRestaurant extends Restaurant {

    public FastFoodRestaurant(String name, int capacity, int clients, double income, double price)
    {
        super(name, capacity, clients, income, price);
    }

//    double localTaxes;
//
//    void localTaxesCalc()
//    {
//        localTaxes = income*0.2;
//    }
//
//    public void printTaxesToConsole()
//    {
//        localTaxesCalc();
//        System.out.println("Income: " + income + " and you have to pay: " + localTaxes);
//    }
}
