package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.createTask(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals("Delivery", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());

    }

    @Test
    public void testFactoryPainting(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.createTask(TaskFactory.PAINTING);

        //Then
        Assert.assertEquals("Refreshing painting", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING);

        //Then
        Assert.assertEquals("Clothes Shopping", shopping.getTaskName());
        Assert.assertEquals(false, shopping.isTaskExecuted());
    }
}
