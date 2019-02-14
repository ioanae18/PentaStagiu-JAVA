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

    //Add users to a flight user list
    public void addUserToFlight(User user, Flight flight) {
        flight.addUser(user);
        addUser(user);
    }

    //Remove users from a flight user list
    public void removeUserFromFlight(User user, Flight flight) {

        flight.removeUser(user);
    }

    //Read users from a flight user list
    public void readUsersFromFlight(Flight flight) {

        flight.readUsers();
    }

    public void getUsers(){
        System.out.println("The passengers list is: ");
        for (User u: users) {
            System.out.println(u.getFullName());
        }
    }

    public User returnUsers(String name){
        for (User u: users) {
            if (u.getFullName().equalsIgnoreCase(name)) {
                return u;
            }
        }
        return null;
    }

    public Flight returnFlight(String name) {
        for (Flight f: flights) {
            if (f.getName().equalsIgnoreCase(name)) {
                return f;
            }
        }
        return null;
    }

    public void addUsersToFlight(String users, String flight) {
        User user = returnUsers(users);
        if (user == null) {
            System.out.println("This user: " + users + " was not found.");
        }

        Flight flight1 = returnFlight(flight);
        if (flight1 == null) {
            System.out.println("We could not find this flight: " + flight);
        }

        flight1.addUser(user);
    }

    //what flights did a user joined
    public void usersFlights(String user) {
        if (returnUsers(user) == null){
            System.out.println(user + " is not an active passenger!");
            return;
        }

        System.out.println(user + " is registered to the following flights: ");
        flights.stream().filter(p -> p.checkUsersList(user)).forEach(flight -> System.out.println(flight.getName() + " " +
                flight.getDestination() + " " + flight.getStatus()));
    }

    //How many flights did a user joined
    public void totalUserFlights(String user) {
        if (returnUsers(user) == null){
            System.out.println(user + " is not an active passenger!");
        }

        long count = flights.stream().filter(p -> p.checkUsersList(user)).count();
        System.out.println(user + " registered to: " + count + " flights.");
    }

    //How many / what destinations did a user visited
    public void visitedDestinations(String user) {
        if (returnUsers(user) == null){
            System.out.println(user + " is not an active passenger!");
        }

        System.out.println(user + " went to the following destinations: ");
        flights.stream().filter(p -> p.checkUsersList(user)).filter(p -> p.getStatus().equals(StatusEnum.FINISHED)).forEach(flight ->
                System.out.println(flight.getDestination()));
    }

    public void totalVisitedDestinations(String user) {
        if (returnUsers(user) == null){
            System.out.println(user + " is not an active passenger!");
        }

        long total = flights.stream().filter(p -> p.checkUsersList(user)).filter(p -> p.getStatus().equals(StatusEnum.FINISHED)).count();
        System.out.println(user + " went in a total of " + total + " destinations.");
    }

    //How many / what are the flights scheduled in the future
    public void scheduledDestinations(String user) {
        if (returnUsers(user) == null){
            System.out.println(user + " is not an active passenger!");
        }

        System.out.println(user + " will go to the following destinations: ");
        flights.stream().filter(p -> p.checkUsersList(user)).filter(p -> p.getStatus().equals(StatusEnum.SCHEDULED)).forEach(flight ->
                System.out.println(flight.getDestination()));
    }

    public void updateFlights(){
        flights.stream().filter(p -> p.getStatus().equals(StatusEnum.SCHEDULED)).
                forEach((p) -> {
                    Date dateTime = p.setDate();
                    Date newDate = new Date(dateTime.getTime() + 60 * p.getFlightDuration());
                    if (newDate.getTime() > new Date().getTime()) {
                        p.setStatus(StatusEnum.FINISHED);
                    }
                });
    }

    public void flightsStatus(){
        flights.stream().forEach((p) -> System.out.println(p.getName() + " " + p.getStatus()));
    }

    //How many / what are the flights that already landed at destination (we assume no delay)
    public void flightsStatus(StatusEnum status) {
        updateFlights();
        System.out.println("Flights with status: " + status);
        flights.stream().filter(p -> p.getStatus().equals(status)).forEach(p -> System.out.println(p.getName() + " " +
                p.getStatus()));
    }
}
