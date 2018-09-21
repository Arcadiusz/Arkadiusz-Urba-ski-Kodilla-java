package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkQueueTestSuite {

    @Test
    public void testHomework() {
        //Given
        HomeworkQueue johmSmithQueue = new JohnSmithQueue();
        HomeworkQueue ivoneEscobarQueue = new IvoneEscobarQueue();
        HomeworkQueue jeseePinkmankQueue = new JeseePinkmanQueue();
        Mentor janKowalski = new Mentor("Jan Kowalski");
        Mentor adamNowak = new Mentor("Adam Nowak");
        johmSmithQueue.registerObserver(janKowalski);
        ivoneEscobarQueue.registerObserver(adamNowak);
        jeseePinkmankQueue.registerObserver(janKowalski);

        //When
        johmSmithQueue.addHomework("task 3.2");
        ivoneEscobarQueue.addHomework("task 7.2");
        ivoneEscobarQueue.addHomework("task 1.2");
        johmSmithQueue.addHomework("task 6.6");
        jeseePinkmankQueue.addHomework("task 7.5");

        //Then
        assertEquals(3, janKowalski.getUpdateCount());
        assertEquals(2, adamNowak.getUpdateCount());
    }
}