package com.kodilla.exception.test;

public class FlightExceptionRunner {

    public static void main ( String [] args ){

    FlightFinder flightFinder = new FlightFinder();
    Flight flight1 = new Flight("Tokyo", "Berlin" );
    try {
        flightFinder.findFlight(flight1);
        System.out.println("This Flight is available");
    }catch (Exception e){
        System.out.println("Flight not available");
    }

    }
}
