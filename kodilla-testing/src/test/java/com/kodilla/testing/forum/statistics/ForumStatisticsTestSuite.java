package com.kodilla.testing.forum.statistics;

import org.junit.*;


import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;


    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("\nAll tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\nPreparing to execute test #" + testCounter);
    }

    @ Test

    public void testPostsEqualsZero(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsQuantity = 0;
        int commentsQuantity = 200;
        ArrayList<String> users = new ArrayList<>();
        for(int i=0; i<50; i++){
            users.add("User " + (i + 1));
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        double AvgPostsPerUser = forumStatistics.getAvgPostPerUser();
        double AvgCommentsPerUser = forumStatistics.getAvgCommentsPerUser();
        double AvgCommentsToPost = forumStatistics.getAvgCommentsToPost();

        ArrayList<Double> list = new ArrayList<>();
        list.add(AvgPostsPerUser);
        list.add(AvgCommentsPerUser);
        list.add(AvgCommentsToPost);

        //Then
        ArrayList<Double> expectedResult = new ArrayList<>();
        expectedResult.add(0.0);
        expectedResult.add(4.0);
        expectedResult.add(0.0);

        Assert.assertEquals(expectedResult, list );
    }

    @ Test

    public void testPostsEqualsThousand(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsQuantity = 1000;
        int commentsQuantity = 200;
        ArrayList<String> users = new ArrayList<>();
        for(int i=0; i<50; i++){
            users.add("User " + (i + 1));
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        double AvgPostsPerUser = forumStatistics.getAvgPostPerUser();
        double AvgCommentsPerUser = forumStatistics.getAvgCommentsPerUser();
        double AvgCommentsToPost = forumStatistics.getAvgCommentsToPost();

        ArrayList<Double> list = new ArrayList<>();
        list.add(AvgPostsPerUser);
        list.add(AvgCommentsPerUser);
        list.add(AvgCommentsToPost);

        //Then
        ArrayList<Double> expectedResult = new ArrayList<>();
        expectedResult.add(20.0);
        expectedResult.add(4.0);
        expectedResult.add(0.2);

        Assert.assertEquals(expectedResult, list );
    }

    @ Test

    public void commentsEqualsZero(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsQuantity = 200;
        int commentsQuantity = 0;
        ArrayList<String> users = new ArrayList<>();
        for(int i=0; i<50; i++){
            users.add("User " + (i + 1));
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        double AvgPostsPerUser = forumStatistics.getAvgPostPerUser();
        double AvgCommentsPerUser = forumStatistics.getAvgCommentsPerUser();
        double AvgCommentsToPost = forumStatistics.getAvgCommentsToPost();

        ArrayList<Double> list = new ArrayList<>();
        list.add(AvgPostsPerUser);
        list.add(AvgCommentsPerUser);
        list.add(AvgCommentsToPost);

        //Then
        ArrayList<Double> expectedResult = new ArrayList<>();
        expectedResult.add(4.0);
        expectedResult.add(0.0);
        expectedResult.add(0.0);

        Assert.assertEquals(expectedResult, list );
    }

    @ Test

    public void testLessCommentsThanPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsQuantity = 500;
        int commentsQuantity = 50;
        ArrayList<String> users = new ArrayList<>();
        for(int i=0; i<50; i++){
            users.add("User " + (i + 1));
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        double AvgPostsPerUser = forumStatistics.getAvgPostPerUser();
        double AvgCommentsPerUser = forumStatistics.getAvgCommentsPerUser();
        double AvgCommentsToPost = forumStatistics.getAvgCommentsToPost();

        ArrayList<Double> list = new ArrayList<>();
        list.add(AvgPostsPerUser);
        list.add(AvgCommentsPerUser);
        list.add(AvgCommentsToPost);

        //Then
        ArrayList<Double> expectedResult = new ArrayList<>();
        expectedResult.add(10.0);
        expectedResult.add(1.0);
        expectedResult.add(0.1);

        Assert.assertEquals(expectedResult, list );
    }

    @ Test

    public void testMoreCommentsThanPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsQuantity = 50;
        int commentsQuantity = 1000;
        ArrayList<String> users = new ArrayList<>();
        for(int i=0; i<50; i++){
            users.add("User " + (i + 1));
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        double AvgPostsPerUser = forumStatistics.getAvgPostPerUser();
        double AvgCommentsPerUser = forumStatistics.getAvgCommentsPerUser();
        double AvgCommentsToPost = forumStatistics.getAvgCommentsToPost();

        ArrayList<Double> list = new ArrayList<>();
        list.add(AvgPostsPerUser);
        list.add(AvgCommentsPerUser);
        list.add(AvgCommentsToPost);

        //Then
        ArrayList<Double> expectedResult = new ArrayList<>();
        expectedResult.add(1.0);
        expectedResult.add(20.0);
        expectedResult.add(20.0);

        Assert.assertEquals(expectedResult, list );
    }

    @ Test

    public void testNoUsers(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsQuantity = 100;
        int commentsQuantity = 100;
        ArrayList<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        double AvgPostsPerUser = forumStatistics.getAvgPostPerUser();
        double AvgCommentsPerUser = forumStatistics.getAvgCommentsPerUser();
        double AvgCommentsToPost = forumStatistics.getAvgCommentsToPost();

        ArrayList<Double> list = new ArrayList<>();
        list.add(AvgPostsPerUser);
        list.add(AvgCommentsPerUser);
        list.add(AvgCommentsToPost);

        //Then
        ArrayList<Double> expectedResult = new ArrayList<>();
        expectedResult.add(0.0);
        expectedResult.add(0.0);
        expectedResult.add(1.0);

        Assert.assertEquals(expectedResult, list );
    }

    @ Test

    public void testHundredUsers(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsQuantity = 100;
        int commentsQuantity = 200;
        ArrayList<String> users = new ArrayList<>();
        for(int i=0; i<100; i++){
            users.add("User " + (i + 1));
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        double AvgPostsPerUser = forumStatistics.getAvgPostPerUser();
        double AvgCommentsPerUser = forumStatistics.getAvgCommentsPerUser();
        double AvgCommentsToPost = forumStatistics.getAvgCommentsToPost();

        ArrayList<Double> list = new ArrayList<>();
        list.add(AvgPostsPerUser);
        list.add(AvgCommentsPerUser);
        list.add(AvgCommentsToPost);

        //Then
        ArrayList<Double> expectedResult = new ArrayList<>();
        expectedResult.add(1.0);
        expectedResult.add(2.0);
        expectedResult.add(2.0);

        Assert.assertEquals(expectedResult, list );
    }

}