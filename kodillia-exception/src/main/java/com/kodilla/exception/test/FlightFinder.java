package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public Boolean findFlight ( Flight flight ) throws RouteNotFoundException{
        Map<String, Boolean> flyMap = new HashMap<>();
        flyMap.put("Kraków", true);
        flyMap.put("New York", true);
        flyMap.put("Paris", false);
        flyMap.put("Sydney", true);
        flyMap.put("Berlin", false);
        flyMap.put("Moscow", true);

        if ( flyMap.containsKey(flight.getArrivalAirport())) {
            return flyMap.get(flight);
        } else {
            throw new RouteNotFoundException(" No Flight ");
        }
    }
}
