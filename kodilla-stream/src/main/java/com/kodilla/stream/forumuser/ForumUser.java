package com.kodilla.stream.forumuser;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsQuantity;

    public ForumUser(int userID, String username, char sex, LocalDate dateOfBirth, int postsQuantity) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postsQuantity = postsQuantity;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return  "| User id : " + userID +
                ", username : " + username  +
                ", date of birth : " + dateOfBirth +
                ", sex : " + sex  +
                ", posts quantity : " + postsQuantity +
                "  |";
    }
}
