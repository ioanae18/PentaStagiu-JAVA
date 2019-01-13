/*
Create a console application that works with restaurants
Each restaurant will have info about the current number of guests, the  income, the price for a fixed menu
Each restaurant will have a method that accommodates new guest in which the number of current guests has to increase with the number of new guests and the income also will increase accordingly(each new guest will consume a fixed price menu).
We will also have the option of calculating the taxes that each restaurant has to pay to the local authorities, but each restaurant will have a different way of calculating this
Let's consider that we will have 2 types of restaurants: vegetarian restaurant and fast food restaurant. Each restaurant will have to pay taxes to the local authorities, which represent 20% of their income. Also the local authorities from the town where we have the restaurants, that want to encourage a healthy life, decided that the vegetarian restaurant will receive a discount of 30% for the taxation.
Implement for each restaurant a method that calculates the tax that it has to pay.

Scenario for testing:
Create a vegetarian restaurant and a fast food restaurant instance
For each one consider that few guests are arriving, which will take advantage of the fixed menu
Display in the console the income for each restaurant and the tax it has to pay to the local authorities.

@author Ivan Emilia-Ioana
 */
package com.pentalog.pentastagiu;

import com.pentalog.pentastagiu.RestaurantPackage.Restaurant;
import com.pentalog.pentastagiu.RestaurantPackage.VegetarianRestaurant;


public class RestaurantMain
{
    public static void main(String[] args)
    {
        Restaurant firstVegetarianRestaurant = new Restaurant("VegetarianLife", 250, 80, 2389.0, 15.0);
        firstVegetarianRestaurant.addClients(5);
        firstVegetarianRestaurant.printTaxesToConsole();
        firstVegetarianRestaurant.printDiscountToConsole();
        System.out.println(firstVegetarianRestaurant.toString());

        Restaurant secondVegetarianRestaurant = new Restaurant("Dreams", 300, 20, 349.8, 15.0);
        secondVegetarianRestaurant.addClients(10);
        secondVegetarianRestaurant.printTaxesToConsole();
        secondVegetarianRestaurant.printDiscountToConsole();
        System.out.println(secondVegetarianRestaurant.toString());

        Restaurant firstFastFoodRestaurant = new Restaurant("FastFood", 170, 60, 430.9, 10.0);
        firstFastFoodRestaurant.addClients(11);
        firstFastFoodRestaurant.printTaxesToConsole();
        System.out.println(firstFastFoodRestaurant.toString());

        Restaurant secondFastFoodRestaurant = new Restaurant("FastFood is life", 170, 60, 430.9, 10.0);
        secondFastFoodRestaurant.addClients(11);
        secondFastFoodRestaurant.printTaxesToConsole();
        System.out.println(secondFastFoodRestaurant.toString());
    }
}
