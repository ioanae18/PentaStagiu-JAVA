package com.pentalog.pentastagiu;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AirportManager extends Flight{

    List<User> users = new ArrayList<>();
    List<Flight> flights = new ArrayList<>();

    public AirportManager(String name, String destination, Date departureDate, int flightDuration, int maxUserCapacity,
                          StatusEnum status, DateFormat df) {
        super(name, destination, departureDate, flightDuration, maxUserCapacity, status, df);
    }

    //Add / Remove / Read flights
    public void addFlight(Flight flight){
        for (Flight f: flights){
            if (flight.getName().equals(f.getName())){
                System.out.println("This flight was already added!");
                return;
            }
        }

        flights.add(flight);
    }

    public void removeFlight(Flight flight){
        if(flights.size() == 0){
            System.out.println("There are no flights to be removed!");
            return;
        }

        Iterator<Flight> flightIterator = flights.iterator();
        while (flightIterator.hasNext()){
            if (flightIterator.next().equals(flight)){
                flightIterator.remove();
                System.out.println("The flight: " + flight.getName() + " was successfuly removed!");
                return;
            }
        }
    }

    public void readFlight(Flight flight){
        for (Flight f: flights){
            System.out.println("The flight: " + f.getName() + " with the destination " + f.getDestination() + " with the maximum capacity of "
            + f.getMaxUserCapacity() + " with the duration " + f.getFlightDuration());
        }
    }

    //Add / Remove / Read users to a flight user list
    public void addUserToFlight(User user, Flight flight) {
        flight.addUser(user);
        addUser(user);
    }

    public void removeUserFromFlight(User user, Flight flight) {
        flight.removeUser(user);
    }

    public void readUsersFromFlight(Flight flight) {
        flight.readUsers();
    }
}
