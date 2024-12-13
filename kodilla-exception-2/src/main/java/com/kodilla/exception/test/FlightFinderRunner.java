package com.kodilla.exception.test;

import java.util.LinkedList;
import java.util.List;

public class FlightFinderRunner {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight f1 = new Flight("Warsaw", "Toronto");
        Flight f2 = new Flight("Warsaw", "Moscow");
        Flight f3 = new Flight("Warsaw", "Bejing");
        Flight f4 = new Flight("Warsaw", "Teheran");
        Flight f5 = new Flight("Warsaw", "Berlin");
        Flight f6 = new Flight("Warsaw", "Madrid");
        Flight f7 = new Flight("Warsaw", "Nairobi");
        Flight f8 = new Flight("Warsaw", "London");
        Flight f9 = new Flight("Warsaw", "New York");

        List<Flight> flights = new LinkedList<>();
        flights.add(f1);
        flights.add(f2);
        flights.add(f3);
        flights.add(f4);
        flights.add(f5);
        flights.add(f6);
        flights.add(f7);
        flights.add(f8);

        for (Flight flight : flights) {
            try {
                flightFinder.findFlight(flight);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Done");
            }
        }

    }
}
