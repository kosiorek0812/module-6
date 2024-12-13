package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    private HashMap<String, Boolean> destinationReachibilities;

    public FlightFinder() {
        this.destinationReachibilities = new HashMap<>();
        destinationReachibilities.put("Toronto", false);
        destinationReachibilities.put("Bejing", false);
        destinationReachibilities.put("Moscow", false);
        destinationReachibilities.put("Teheran", false);
        destinationReachibilities.put("London", true);
        destinationReachibilities.put("Berlin", true);
        destinationReachibilities.put("Madrid", true);
        destinationReachibilities.put("Rome", true);
        destinationReachibilities.put("Nairobi", true);

    }
    public Flight findFlight(Flight flight) throws RouteNotFoundException {
        if (destinationReachibilities.get(flight.getArrivalAirport()) == false) {
            throw new RouteNotFoundException("Route not found");
        } else {
            return flight;
        }

    }
}
