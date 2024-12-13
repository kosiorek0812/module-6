package com.kodilla.exception.test;

public class RouteNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public RouteNotFoundException(final String errorMessage) {
        super(errorMessage);
    }
}
