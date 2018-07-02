package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){
        //Given

        //When
        Logger.getInstance().log("Successfully connected to a server");
        //Then
        Assert.assertEquals("Successfully connected to a server", Logger.getInstance().getLastLog());

    }
}
