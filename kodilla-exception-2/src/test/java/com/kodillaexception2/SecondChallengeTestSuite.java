package com.kodillaexception2;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import com.kodilla.exception.test.WrongArgumentException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SecondChallengeTestSuite {

    @Test
    void testPositivePath() {
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        assertDoesNotThrow(() -> exceptionHandling.handleException(1.99, 1.49));
        assertDoesNotThrow(() -> exceptionHandling.handleException(1.0, 1.51));



    }

    @Test
    void testNegativePath() {
        ExceptionHandling exceptionHandling = new ExceptionHandling();

         assertThrows(WrongArgumentException.class, () -> exceptionHandling.handleException(2, 1.5));
         assertThrows(WrongArgumentException.class, () -> exceptionHandling.handleException(2.01, 1.5));

    }

}
