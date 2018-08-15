package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user = new Millenials("Tom Smith");
        User user1 = new YGeneration("Marry Hawk");
        User user2 = new ZGeneration("Lary Hawkngs");

        //When
        System.out.println(user.getUserName() + " share's his post on: " + user.sharePost());
        System.out.println(user1.getUserName() + " share's her post on: " + user1.sharePost());
        System.out.println(user2.getUserName() + " share's his post on: " + user2.sharePost());

        //Then
        Assert.assertEquals("Facebook", user.sharePost());
        Assert.assertEquals("Twitter", user1.sharePost());
        Assert.assertEquals("Snapchat", user2.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user = new Millenials("Tom Smith");

        //When
        System.out.println(user.getUserName() + " share's his post on: " + user.sharePost());

        user.setSocialPublisher(new TwitterPublisher());
        System.out.println(user.getUserName() + " share's his post on: " + user.sharePost());

        //Then
        Assert.assertEquals("Twitter", user.sharePost());
    }
}

