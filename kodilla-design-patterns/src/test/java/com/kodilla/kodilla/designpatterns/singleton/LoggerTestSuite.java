package com.kodilla.kodilla.designpatterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {



    @Test
    void testLog() {
        Logger logger = Logger.INSTANCE;
        logger.log("WARNING: abcdefg hijklmnopqrstuvwxyz");
        assertEquals("WARNING: abcdefg hijklmnopqrstuvwxyz", logger.getLastLog());
    }


}