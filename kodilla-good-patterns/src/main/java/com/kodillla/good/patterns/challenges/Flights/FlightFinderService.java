package com.kodillla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;

public class FlightFinderService {

        public static final String WARSAW = "Warsaw";
        public static final String LONDON = "London";
        public static final String NEWYORK = "New York";
        public static final String KRAKOW = "Kraków";
        public static final String KIEV = "Kiev";
        public static final String MOSCOW = "Moscow";
        public static final String SYDNEY = "Sydney";
        public static final String PARIS = "Paris";

        private final List<Flight> theFlightsList = new ArrayList<>();

    public FlightFinderService() {
            theFlightsList.add(new Flight(WARSAW, LONDON));
            theFlightsList.add(new Flight(WARSAW, NEWYORK));
            theFlightsList.add(new Flight(WARSAW, KIEV));
            theFlightsList.add(new Flight(WARSAW, MOSCOW));
            theFlightsList.add(new Flight(KIEV, KRAKOW));
            theFlightsList.add(new Flight(MOSCOW, KIEV));
            theFlightsList.add(new Flight(MOSCOW, SYDNEY));
            theFlightsList.add(new Flight(MOSCOW, PARIS));
            theFlightsList.add(new Flight(WARSAW, SYDNEY));
        }

        public List<Flight> getList() {
            return new ArrayList<>(theFlightsList);
        }

        public void flightsFrom(String city) {
            getList().stream()
                    .filter(flights -> flights.getDepartureFrom().equals(city))
                    .forEach(System.out::println);
        }

        public void flightsTo(String city) {
            getList().stream()
                    .filter(flights -> flights.getArrivalTo().equals(city))
                    .forEach(System.out::println);
        }

}
