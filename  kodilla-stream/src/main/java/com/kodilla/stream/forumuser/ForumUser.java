package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate dateOfBirth;
    private final int postNumbers;

    public ForumUser(int userId, String userName, char userSex, LocalDate dateOfBirth, int postNumbers) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.dateOfBirth = dateOfBirth;
        this.postNumbers = postNumbers;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostNumbers() {
        return postNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return getUserId() == forumUser.getUserId() &&
                getUserSex() == forumUser.getUserSex() &&
                getPostNumbers() == forumUser.getPostNumbers() &&
                Objects.equals(getUserName(), forumUser.getUserName()) &&
                Objects.equals(dateOfBirth, forumUser.dateOfBirth);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getUserId(), getUserName(), getUserSex(), dateOfBirth, getPostNumbers());
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", dateOfBirth=" + dateOfBirth +
                ", postNumbers=" + postNumbers +
                '}';
    }
}

