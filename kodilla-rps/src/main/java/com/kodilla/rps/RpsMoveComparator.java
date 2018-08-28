package com.kodilla.rps;

public class RpsMoveComparator {
    public static RpsRoundResult compare(RpsTurn userTurn, RpsTurn computerTurn) {
        switch (userTurn) {
            case ROCK:
                if (computerTurn == RpsTurn.ROCK) {
                    return RpsRoundResult.DRAW;
                }
                if (computerTurn == RpsTurn.SCISSORS) {
                    return RpsRoundResult.USER;
                }
                if (computerTurn == RpsTurn.PAPER) {
                    return RpsRoundResult.COMPUTER;
                }
            case PAPER:
                if (computerTurn == RpsTurn.ROCK) {
                    return RpsRoundResult.USER;
                }
                if (computerTurn == RpsTurn.SCISSORS) {
                    return RpsRoundResult.COMPUTER;
                }
                if (computerTurn == RpsTurn.PAPER) {
                    return RpsRoundResult.DRAW;
                }
            case SCISSORS:
                if (computerTurn == RpsTurn.ROCK) {
                    return RpsRoundResult.COMPUTER;
                }
                if (computerTurn == RpsTurn.SCISSORS) {
                    return RpsRoundResult.DRAW;
                }
                if (computerTurn == RpsTurn.PAPER) {
                    return RpsRoundResult.USER;
                }
            case END:
                return RpsRoundResult.END;

            case REPLAY:
                return RpsRoundResult.REPLAY;

            default:
                return RpsRoundResult.BAD;
        }
    }
}
