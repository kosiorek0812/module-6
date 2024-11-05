package com.kodilla.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.array.GetAverage;
import org.junit.jupiter.api.Test;
import java.util.Random;
import org.junit.jupiter.api.*;



public class ArrayOperationsTestSuite {

    @Test
    void testArrayOperationsRandom() {
        //Given
        final int ARRAY_LENGTH = 5;
        GetAverage testGetAverage = new GetAverage();

        //When

        int[] exampleArrayOfInt = new int[ARRAY_LENGTH];
        Random rand = new Random();
        int sum = 0;
        for (int i = 0; i < exampleArrayOfInt.length; i++) {
            exampleArrayOfInt[i] = rand.nextInt(0, 1000);
            sum += exampleArrayOfInt[i];
        }
        double testAverage = (double) sum / (double) exampleArrayOfInt.length;

        //Then
        Assertions.assertEquals(testAverage, testGetAverage.getAverageWithoutIntStream(exampleArrayOfInt));
        Assertions.assertEquals(testAverage, testGetAverage.getAverageWithIntStream(exampleArrayOfInt));

    }
    @Test
    void testArrayOperations() {
        GetAverage testGetAverage = new GetAverage();
        int[] exampleArrayOfInt = {1, 2, 3, 4, 5, 6, 7};
        double testAverage = (1.0 + 2.0 + 3.0 + 4.0 + 5.0 + 6.0 + 7.0) / 7.0;
        Assertions.assertEquals(testAverage, testGetAverage.getAverageWithoutIntStream(exampleArrayOfInt));
        Assertions.assertEquals(testAverage, testGetAverage.getAverageWithIntStream(exampleArrayOfInt));
    }
    @Test
    void testDisplay() {
        GetAverage testGetAverage = new GetAverage();
        int[] exampleArrayOfInt = {1, 2, 3, 4, 5, 6, 7};
        testGetAverage.display(exampleArrayOfInt);
    }


}
