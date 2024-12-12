package com.kodilla.exception.test;

public class ExceptionHandling {


    public static void handleException(double x, double y) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            throw new WrongArgumentException("Wrong argument");

        } finally {
            System.out.println("Done");
        }

    }





}