package com.kodilla.exception.test;

public class WrongArgumentException extends Exception {
    private static final long serialVersionUID = 1L;

    public WrongArgumentException(String errorMessage) {
        super(errorMessage);
    }


}
