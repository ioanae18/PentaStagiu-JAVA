package com.pentalog.pentastagiu.RestaurantPackage;

public class Restaurant {
    protected String name;
    protected int capacity;
    protected int clients;
    protected double income;
    protected double price;

    public Restaurant(String name, int capacity, int clients, double income, double price) {
        this.name = name;
        this.capacity = capacity;
        this.clients = clients;
        this.income = income;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int Capacity) {
        if( Capacity > 0 )
        {
            this.capacity = Capacity;
        }
    }

    public int getClients() {
        return clients;
    }

    public void setClients(int clients) {
        this.clients = clients;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double priceForFixedMenu) {
        if( priceForFixedMenu > 0 )
        {
            this.price = priceForFixedMenu;
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", clients=" + clients +
                ", income=" + income +
                ", price=" + price +
                '}';
    }

    public void addClients (int newClients)
    {
        if ((newClients > 0) && (this.clients + newClients <= this.capacity))
        {
            this.clients += newClients;
            this.increaseIncome (newClients);
            System.out.println("The new number of clients is: " +  newClients);
        }
    }

    private void increaseIncome (int newClients)
    {
        if (newClients > 0)
        {
            this.income += (newClients * this.getPrice());
        }
    }

    double localTaxes;

    void localTaxesCalc()
    {
        localTaxes = income*0.2;
    }

    double taxesDiscount;

    void taxesDiscount()
    {
        taxesDiscount = localTaxes*0.3;
    }

    public void printTaxesToConsole()
    {
        localTaxesCalc();
        System.out.println("Income: " + income + " and you have to pay: " + localTaxes);
    }

    public void printDiscountToConsole()
    {
        taxesDiscount();
        System.out.println("You have a discount: " + taxesDiscount);
    }
}
