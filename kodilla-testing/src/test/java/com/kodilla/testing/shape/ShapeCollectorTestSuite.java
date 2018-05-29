package com.kodilla.testing.shape;

import org.junit.*;
import java.util.ArrayList;

import com.kodilla.testing.shape.*;
import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Testing starts here");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Testing ended");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest(){
        System.out.println("Test # " + testCounter + " ended ");
    }

    @Test
    public void testAddFigure(){
        //Given
        Shape cirlce = (Shape) new Circle(8);
        Shape square = new Square(2);
        Shape triangle = (Shape) new Triangle(4,3.5);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(cirlce);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        int actualListSize = shapeCollector.getListSize();

        //Then
        Assert.assertEquals(3, actualListSize);
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(2);
        Shape triangle = (Shape) new Triangle(4,3.5);
        shapeCollector.addFigure( square );
        shapeCollector.addFigure( triangle );

        //When
        shapeCollector.removeFigure(square);
        int actualListSize = shapeCollector.getListSize();

        //Then
        Assert.assertEquals(1 , actualListSize);
    }

    @Test
    public void testGetFigure(){
        //Given
        Shape cirlce = (Shape) new Circle(8);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(cirlce);

        //When
        Shape expectedShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(cirlce , expectedShape);
    }

    @Test
    public void testShowFigure(){
        //Given
        ArrayList<String> names = new ArrayList();
        Shape circle = new Circle(8);
        Shape square = new Square(2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        names.add(shapeCollector.getFigure(0).getShapeName());
        names.add(shapeCollector.getFigure(1).getShapeName());

        //When
        ArrayList<String> actualNames = new ArrayList<>();
        actualNames = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(names, actualNames);

    }
}
