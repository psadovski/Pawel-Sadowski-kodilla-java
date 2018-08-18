package com.kodilla.rps;

public class RpsMoveComparator {
    public static RpsRoundResult result;

    public static RpsRoundResult compare(RpsTurn userTurn, RpsTurn computerTurn) {
        switch (userTurn) {
            case ROCK:
                if (computerTurn == RpsTurn.ROCK) {
                    return result = RpsRoundResult.DRAW;
                }
                if (computerTurn == RpsTurn.SCISSORS) {
                    return result = RpsRoundResult.USER;
                }
                if (computerTurn == RpsTurn.PAPER) {
                    return result = RpsRoundResult.COMPUTER;
                }
                break;
            case PAPER:
                if (computerTurn == RpsTurn.ROCK) {
                    return result = RpsRoundResult.USER;
                }
                if (computerTurn == RpsTurn.SCISSORS) {
                    return result = RpsRoundResult.COMPUTER;
                }
                if (computerTurn == RpsTurn.PAPER) {
                    return result = RpsRoundResult.DRAW;
                }
                break;
            case SCISSORS:
                if (computerTurn == RpsTurn.ROCK) {
                    return result = RpsRoundResult.COMPUTER;
                }
                if (computerTurn == RpsTurn.SCISSORS) {
                    return result = RpsRoundResult.DRAW;
                }
                if (computerTurn == RpsTurn.PAPER) {
                    return result = RpsRoundResult.USER;
                }
                break;
        }
        return result;
    }
}
