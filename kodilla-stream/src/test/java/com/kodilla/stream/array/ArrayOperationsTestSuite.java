package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given

        int [] array = new int[10];
        array[0] = 2;
        array[1] = 3;
        array[2] = 1;
        array[3] = 5;
        array[4] = 13;
        array[5] = 11;
        array[6] = 2;
        array[7] = 7;
        array[8] = 8;
        array[9] = 9;

        //When
        ArrayOperations.getAverage(array);

        //Then
        int sum = IntStream.range(0,array.length)
        .map(n -> array[n])
        .sum();
        Assert.assertEquals(61, sum);
        System.out.println("expected value = " + 61 );
        System.out.println( "actual value = " + sum);

    }
}
