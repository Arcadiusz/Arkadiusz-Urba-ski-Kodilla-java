package com.kodillla.good.patterns.challenges.Flights;

public class FlightMain {

    public static void main ( String [] args ){

        FlightFinderService finderService = new FlightFinderService();

        System.out.println("Flights from Warsaw");
        finderService.flightsFrom("Warsaw");

        System.out.println();

        System.out.println("flights to Sydney");
        finderService.flightsTo("Sydney");

        System.out.println();
        finderService.flightszThrough("Warsaw", "Kraków");

    }
}
