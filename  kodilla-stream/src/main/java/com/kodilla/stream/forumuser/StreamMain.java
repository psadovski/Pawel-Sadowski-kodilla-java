package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> forumMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears()  >= 20)
                .filter(forumUser -> forumUser.getPostNumbers() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        forumMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
