package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User user1 = new Millenials("John");
        User user2 = new YGeneration("Kate");
        User user3 = new ZGeneration("Bruce");

        //When
        String johnShareMethod = user1.sharePost();
        System.out.println(user1 + " " + johnShareMethod);
        String kateShareMethod = user2.sharePost();
        System.out.println(user2 + " " + kateShareMethod);
        String bruceShareMethod = user3.sharePost();
        System.out.println(user3 + " " + bruceShareMethod);

        //Then
        Assert.assertEquals("Twitter", johnShareMethod);
        Assert.assertEquals("Snapchat", kateShareMethod);
        Assert.assertEquals("Facebook", bruceShareMethod);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User user1 = new Millenials("John");

        //When
        String johnShareMethod = user1.sharePost();
        System.out.println(user1 + " " + johnShareMethod);
        user1.setShareStrategy(new FacebookPublisher());
        johnShareMethod = user1.sharePost();
        System.out.println(user1 + " " + johnShareMethod);

        //Then
        Assert.assertEquals("Facebook", johnShareMethod);

    }
}
