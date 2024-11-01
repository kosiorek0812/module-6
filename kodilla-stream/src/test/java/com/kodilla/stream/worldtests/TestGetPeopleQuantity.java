package com.kodilla.stream.worldtests;

import com.kodilla.stream.world.*;
import org.junit.jupiter.api.*;

import java.util.*;
import java.math.BigDecimal;

public class TestGetPeopleQuantity {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("37637123"));
        Country romania = new Country("Romania", new BigDecimal("19064409"));
        Country china = new Country("China", new BigDecimal("1409987876"));
        Country india = new Country("India", new BigDecimal("1429987656"));
        Country nigeria = new Country("Nigeria", new BigDecimal("209876989"));
        Country uganda = new Country("Uganda", new BigDecimal("43567897"));

        Continent europe = new Continent("Europe", List.of(poland, romania));
        Continent asia = new Continent("Asia", List.of(india, china));
        Continent africa = new Continent("Africa", List.of(nigeria, uganda));

        World world = new World(List.of(europe, africa, asia));

        //When
        BigDecimal sum = BigDecimal.ZERO;
        for (Continent continent : world.getContinents()) {
            for (Country country : continent.getCountries()) {
                sum = sum.add(country.getPeopleQuantity());
            }
        }
        //Then
        BigDecimal expected = world.getPeopleQuantity();
        Assertions.assertEquals(expected, sum);


    }
}
