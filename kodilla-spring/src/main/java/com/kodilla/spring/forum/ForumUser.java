package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ForumUser {
    String userName;

    public ForumUser() {
        this.userName = "John Smith";
    }

    public String getUserName() {
        return this.userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return Objects.equals(getUserName(), forumUser.getUserName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getUserName());
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
