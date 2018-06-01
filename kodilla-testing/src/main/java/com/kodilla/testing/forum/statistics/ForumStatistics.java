package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double avgPostPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsToPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentsPerUser() {

        return avgCommentsPerUser;
    }

    public double getAvgCommentsToPost() {

        return avgCommentsToPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        usersQuantity = statistics.usersNames().size();

        postsQuantity = statistics.postsCount();

        commentsQuantity = statistics.commentsCount();

        avgPostPerUser = 0;

        if (usersQuantity != 0) {
            avgPostPerUser = ((double) postsQuantity / (double) usersQuantity);
        } else {
            avgPostPerUser = 0;
        }

        avgCommentsPerUser = 0;
        if (usersQuantity != 0) {
            avgCommentsPerUser = ((double)commentsQuantity / (double) usersQuantity);
        } else {
            avgCommentsPerUser = 0;
        }

        avgCommentsToPost = 0;
        if (postsQuantity != 0) {
            avgCommentsToPost = ((double)commentsQuantity / (double) postsQuantity);
        } else {
            avgCommentsToPost = 0;
        }
    }
}