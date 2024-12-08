package com.kodillaexception2;

import com.kodilla.exception.test.SecondChallenge;
import com.kodilla.exception.test.WrongArgumentException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SecondChallengeTestSuite {




    @Test
    void testPositivePath() {
        SecondChallenge challenge = new SecondChallenge();

        assertDoesNotThrow(() -> challenge.probablyIWillThrowException(1.99, 1.49));
        assertDoesNotThrow(() -> challenge.probablyIWillThrowException(1.0, 1.51));



    }

    @Test
    void testNegativePath() {
        SecondChallenge challenge = new SecondChallenge();
         assertThrows(WrongArgumentException.class, () -> challenge.probablyIWillThrowException(2, 1.5));
         assertThrows(WrongArgumentException.class, () -> challenge.probablyIWillThrowException(2.01, 1.5));

    }

}
