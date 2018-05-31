package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    Statistics statistics;

    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double avgPostPerUser;
    double avgCommentsPerUser;
    double avgCommentsToPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsersQuantity() {
        return statistics.usersNames().size();
    }

    public int getPostsQuantity() {
        return statistics.postsCount();
    }

    public int getCommentsQuantity() {
        return statistics.commentsCount();
    }

    public double getAvgPostPerUser() {
        avgPostPerUser = 0;
        if (statistics.usersNames().size() != 0) {
            avgPostPerUser = statistics.postsCount() * 1.0 / statistics.usersNames().size();
        } else {
            avgPostPerUser = 0;
        }
        return avgPostPerUser;
    }

    public double getAvgCommentsPerUser() {
        avgCommentsPerUser = 0;
        if (statistics.usersNames().size() != 0) {
            avgCommentsPerUser = statistics.commentsCount() * 1.0 / statistics.usersNames().size();
        } else {
            avgCommentsPerUser = 0;
        }
        return avgCommentsPerUser;
    }

    public double getAvgCommentsToPost() {
        avgCommentsToPost = 0;
        if (statistics.postsCount() != 0) {
            avgCommentsToPost = statistics.commentsCount() * 1.0 / statistics.postsCount();
        } else {
            avgCommentsToPost = 0;
        }
        return avgCommentsToPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersQuantity = getUsersQuantity();
        this.commentsQuantity = getPostsQuantity();
        this.postsQuantity = getCommentsQuantity();
        double avrPostsUser = getAvgPostPerUser();
        double avrCommentsUser = getAvgCommentsPerUser();
        double avrCommentsPost = getAvgCommentsToPost();

    }
}
