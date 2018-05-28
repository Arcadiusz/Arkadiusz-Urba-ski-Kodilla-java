package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

import com.kodilla.testing.collection.OddNumbersExterminator;

public class CollectionTestSuite {
    ArrayList<Integer> myList = new ArrayList<Integer>();

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test

    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator testing = new OddNumbersExterminator();
        List<Integer> myList = new ArrayList<Integer>();
        List<Integer> onlyEven = new ArrayList<Integer>();

        //When
        testing.exterminate(myList);
        System.out.println(myList);
        System.out.println(onlyEven);

        //Then

        Assert.assertEquals(myList, onlyEven);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator testing = new OddNumbersExterminator();
        List<Integer> myList = new ArrayList<>();

        for (int i=0; i<10; i++) {
            myList.add(i + 1);
        }

        List<Integer> result = testing.exterminate(myList);

        //When
        testing.exterminate( myList );
        System.out.println("Full list : " + myList);
        System.out.println("Only even list : " + result);

        //Then
        List<Integer> expectedArray = new ArrayList<Integer>();
        expectedArray.add(2);
        expectedArray.add(4);
        expectedArray.add(6);
        expectedArray.add(8);
        expectedArray.add(10);
        Assert.assertEquals(expectedArray, result);


    }

}
