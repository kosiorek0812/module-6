package com.kodilla.exception.test;

public class SecondChallengeRunner {

    public static void main(String[] args) {

        SecondChallenge challenge = new SecondChallenge();
        try {
            challenge.probablyIWillThrowException(1.0, 1.0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finished anyway");
        }
        try {
            challenge.probablyIWillThrowException(1.0, 1.5);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finished anyway");
        }
    }
}
