package com.kodilla.testing.collection;

import java.util.ArrayList;
import org.junit.*;

import com.kodilla.testing.collection.OddNumbersExterminator;

public class CollectionTestSuite {

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

        //When
        testing.exterminate(testing.myList, testing.onlyEven);
        System.out.println("Full list " + testing.myList );
        System.out.println("Only even list" + testing.onlyEven);

        //Then

        Assert.assertEquals(testing.myList, testing.onlyEven);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator testing = new OddNumbersExterminator();
        testing.addNumbers();
        //When
        testing.exterminate(testing.myList, testing.onlyEven);
        System.out.println("Full list :" + testing.myList);
        System.out.println("Only even list :" + testing.onlyEven);
        //Then
        ArrayList<Integer> expectedArray = new ArrayList<Integer>();
        expectedArray.add(2);
        expectedArray.add(4);
        expectedArray.add(6);
        expectedArray.add(8);
        expectedArray.add(10);
        Assert.assertEquals(expectedArray, testing.onlyEven);
    }

}
