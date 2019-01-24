package com.pentalog.pentastagiu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.text.ParseException;

enum StatusEnum{
    SCHEDULED,
    CANCELED,
    FINISHED
}

public class Flight {
    String name;
    String destination;
    Date departureDate;
    int flightDuration;
    int maxUserCapacity;
    StatusEnum status;

    List<User> users = new ArrayList<>();

    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    void setDate(String dateformat) {
        String strDate = "24-01-2019 19:06:45";
        try {
            Date newdate = df.parse(strDate);
            System.out.println(newdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
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

    public DateFormat getDf() {
        return df;
    }

    public void setDf(DateFormat df) {
        this.df = df;
    }


}