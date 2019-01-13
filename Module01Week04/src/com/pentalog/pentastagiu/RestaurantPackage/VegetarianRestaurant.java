package com.pentalog.pentastagiu.RestaurantPackage;

public class VegetarianRestaurant extends Restaurant {

    public VegetarianRestaurant(String name, int capacity, int clients, double income, double price)
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
//    double taxesDiscount;
//
//    void taxesDiscount()
//    {
//        taxesDiscount = localTaxes*0.3;
//    }
//
//    public void printTaxesToConsole()
//    {
//        localTaxesCalc();
//        System.out.println("Income: " + income + " and you have to pay: " + localTaxes);
//    }
//
//    public void printDiscountToConsole()
//    {
//        taxesDiscount();
//        System.out.println("Income: " + income + " and you have a discount: " + taxesDiscount);
//    }

}
