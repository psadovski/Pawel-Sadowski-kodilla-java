package com.kodilla.testing.forum.statistics;

public class StatisticCalculator {
    private int userQuantity;
    private int postsCount;
    private int commentsCount;
    private double avaragePostsPerUser;
    private double avarageCommentsPerUser;
    private double avarageCommentsPerPost;

    public Metrics calculateAdvStatistics(Statistics statistics) {
        userQuantity = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        avaragePostsPerUser = userQuantity == 0 ? 0 : (double) postsCount / userQuantity;
        avarageCommentsPerUser = userQuantity == 0 ? 0 : (double) commentsCount / userQuantity;
        avarageCommentsPerPost = postsCount == 0 ? 0 : (double) commentsCount / postsCount;

        return new Metrics(userQuantity,
                postsCount,
                commentsCount,
                avaragePostsPerUser,
                avarageCommentsPerUser,
                avarageCommentsPerPost);
    }

    public void showStatistics(Metrics metrics) {
        metrics.show();
    }
}
