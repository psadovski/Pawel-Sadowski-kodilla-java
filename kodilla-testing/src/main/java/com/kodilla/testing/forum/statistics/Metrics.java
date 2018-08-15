package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class Metrics {
   private int userQuantity;
   private int postsCount;
   private int commentsCount;
   private double avaragePostsPerUser;
   private double avarageCommentsPerUser;
   private double avarageCommentsPerPost;

    public Metrics(int userQuantity,
                   int postsCount,
                   int commentsCount,
                   double avaragePostsPerUser,
                   double avarageCommentsPerUser,
                   double avarageCommentsPerPost) {

        this.userQuantity = userQuantity;
        this.postsCount = postsCount;
        this.commentsCount = commentsCount;
        this.avaragePostsPerUser = avaragePostsPerUser;
        this.avarageCommentsPerUser = avarageCommentsPerUser;
        this.avarageCommentsPerPost = avarageCommentsPerPost;
    }

    public int getUserQuantity() {
        return this.userQuantity;
    }

    public int getPostsCount() {
        return this.postsCount;
    }

    public int getCommentsCount() {
        return this.commentsCount;
    }

    public double getAvaragePostsPerUser() {
        return this.avaragePostsPerUser;
    }

    public double getAvarageCommentsPerUser() {
        return this.avarageCommentsPerUser;
    }

    public double getAvarageCommentsPerPost() {
        return this.avarageCommentsPerPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Metrics)) return false;
        Metrics metrics = (Metrics) o;
        return getUserQuantity() == metrics.getUserQuantity() &&
                getPostsCount() == metrics.getPostsCount() &&
                getCommentsCount() == metrics.getCommentsCount() &&
                Double.compare(metrics.getAvaragePostsPerUser(), getAvaragePostsPerUser()) == 0 &&
                Double.compare(metrics.getAvarageCommentsPerUser(), getAvarageCommentsPerUser()) == 0 &&
                Double.compare(metrics.getAvarageCommentsPerPost(), getAvarageCommentsPerPost()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getUserQuantity(), getPostsCount(), getCommentsCount(), getAvaragePostsPerUser(), getAvarageCommentsPerUser(), getAvarageCommentsPerPost());
    }

    @Override
    public String toString() {
        return "Metrics{" +
                "userQuantity=" + userQuantity +
                ", postsCount=" + postsCount +
                ", commentsCount=" + commentsCount +
                ", avaragePostsPerUser=" + avaragePostsPerUser +
                ", avarageCommentsPerUser=" + avarageCommentsPerUser +
                ", avarageCommentsPerPost=" + avarageCommentsPerPost +
                '}';
    }

    public void show() {
        System.out.println("Total users quantity equals: " + userQuantity);
        System.out.println("Total users posts count equals: " + postsCount);
        System.out.println("Total users comments count equals: " + userQuantity);
        System.out.println("Avarage number posts per user: " + avaragePostsPerUser);
        System.out.println("Avarage number comments per User: " + avarageCommentsPerPost);
        System.out.println("Avarage number comments per post" + avarageCommentsPerPost);
    }
}
