package com.pentalog.pentastagiu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.text.ParseException;
import java.util.Iterator;

enum StatusEnum{
    SCHEDULED,
    CANCELED,
    FINISHED
}

public class Flight {
    private String name;
    private String destination;
    private Date departureDate;
    private int flightDuration;
    private int maxUserCapacity;
    private StatusEnum status;

    List<User> users = new ArrayList<>();

    //Add users
    public void addUser(User user){
        if (users.size() >= maxUserCapacity){
            System.out.println("The maximum capacity at flight: " + this.name + " was reached!");
            return;
        }

        for (User s: users){
            if (s.equals(user)){
                System.out.println("This user: " + user.getFullName() + " is already added to the flight: " + this.name);
//                return;
            }
        }

        users.add(user);
        System.out.println("User: " + user.getFullName() + " was successfuly added to the flight: " + this.name);
    }

    //Remove users
    public void removeUser(User user){
        if (users.size() == 0){
            System.out.println("There are no users to be removed!");
            return;
        }

        Iterator<User> userIterator = users.iterator();
        while (userIterator.hasNext()){
            if (userIterator.next().equals(user)){
                userIterator.remove();
                System.out.println("The user: " + user.getFullName() + "was successfuly removed from the flight: " + getName());
                return;
            }
        }
    }

    //Read users
    public void readUsers(){
        System.out.println("The passengers list is: ");
        for (User u: users) {
            System.out.println(u.getFullName());
        }
    }

    public Boolean checkUsersList(String name) {
        for (User u: users) {
            if (u.getFullName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }

    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date setDate() {
        String strDate = "24-01-2019 19:06:45";
        try {
            Date newdate = df.parse(strDate);
            System.out.println(newdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Flight(String name, String destination, Date departureDate, int flightDuration, int maxUserCapacity, StatusEnum status,
                  DateFormat df) {
        this.name = name;
        this.destination = destination;
        this.departureDate = departureDate;
        this.flightDuration = flightDuration;
        this.maxUserCapacity = maxUserCapacity;
        this.status = status;
        this.df = df;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public int getMaxUserCapacity() {
        return maxUserCapacity;
    }

    public void setMaxUserCapacity(int maxUserCapacity) {
        this.maxUserCapacity = maxUserCapacity;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
