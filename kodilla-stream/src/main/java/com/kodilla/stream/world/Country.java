package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country implements PeopleQuantity{
    private final String name;
    private BigDecimal peopleQuantity;

    public Country(String name, BigDecimal peopleQuantity) {
        this.name = name;
        this.peopleQuantity = peopleQuantity;

    }

    @Override
    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
