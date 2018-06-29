package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.addTaskToDoList("Task 1");
        board.addTaskInProgressList("Task 2");
        board.addTaskDoneList("Task 3");

        String task1 = board.getToDoList().tasks.toString();
        String task2 = board.getInProgressList().tasks.toString();
        String task3 = board.getDoneList().tasks.toString();

        //Then
        Assert.assertEquals("[Task 1]", task1);
        Assert.assertEquals("[Task 2]", task2);
        Assert.assertEquals("[Task 3]", task3);
    }
}
