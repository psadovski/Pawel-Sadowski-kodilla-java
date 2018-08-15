package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    public List<ForumUser> getUserList() {
        List<ForumUser> forumUserskList = new ArrayList<>();

        forumUserskList.add(new ForumUser(0001, "Tom", 'M', LocalDate.of(2000,12,30),3));
        forumUserskList.add(new ForumUser(0002, "Andy", 'M', LocalDate.of(1987, 8, 30), 13));
        forumUserskList.add(new ForumUser(0003, "Paul", 'M', LocalDate.of(1967, 9, 23), 0));
        forumUserskList.add(new ForumUser(0004, "Hannah", 'F', LocalDate.of(1999, 12, 11), 11));
        forumUserskList.add(new ForumUser(0005, "Max", 'M', LocalDate.of(1984, 11, 2), 8));
        forumUserskList.add(new ForumUser(0006, "Sonia", 'F', LocalDate.of(1978, 1, 28), 15));
        forumUserskList.add(new ForumUser(0007, "Adam", 'M', LocalDate.of(2000, 4, 7), 46));

        return new ArrayList<>(forumUserskList);
    }
}

