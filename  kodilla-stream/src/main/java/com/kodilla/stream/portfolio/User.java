package com.kodilla.stream.portfolio;

import java.util.Objects;

public final class User {
    private final String userName;
    private final String realName;

    public User(final String userName, final String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getRealName() {
        return this.realName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getUserName(), user.getUserName()) &&
                Objects.equals(getRealName(), user.getRealName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getUserName(), getRealName());
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
