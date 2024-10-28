package com.kodilla.stream.beautifier;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.*;

public class PoemTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

    }
    @Test
    public void poemBeautifierTest1() {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        Assertions.assertEquals("LALALAND", poemBeautifier.beautify("LaLaLand", (p) -> p.toUpperCase()));
    }
    @Test
    public void poemBeautifierTest2() {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        Assertions.assertEquals("the man who stared at goats", poemBeautifier.beautify("The Man Who Stared At Goats", (p) -> p.toLowerCase()));
    }
    @Test
    public void poemBeautifierTest3() {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        Assertions.assertEquals("ABC Dead Poets Society ABC",  poemBeautifier.beautify("Dead Poets Society", (p) -> "ABC " + p + " ABC"));
    }
    @Test
    public void poemBeautifierTest4() {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        Assertions.assertEquals("defghij", poemBeautifier.beautify("abcdefghijklmnopq", (p) -> p.substring(3, 10)));
    }


}
