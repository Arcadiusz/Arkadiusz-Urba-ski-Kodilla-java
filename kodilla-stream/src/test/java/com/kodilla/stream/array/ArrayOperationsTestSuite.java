package com.kodilla.stream.array;


import org.junit.Assert;
import org.junit.Test;
import static com.kodilla.stream.array.ArrayOperations.getAverage;



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
        double result = getAverage(array);

        //Then
        Assert.assertEquals(6.1,result,0);
        System.out.println("expected averge = " + 6.1);
        System.out.println("actul average = " + result);

    }
}
