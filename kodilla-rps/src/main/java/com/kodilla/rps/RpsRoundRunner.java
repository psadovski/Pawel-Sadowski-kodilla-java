package com.kodilla.rps;

public class RpsRoundRunner {
    private final int roundNumber;

    public RpsRoundRunner(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public RpsRoundResult run() {

        RpsMenu.printRoundInfo(getRoundNumber());
        RpsMenu.printShortMenu();
        RpsTurn userTurn = RpsMenu.getUserTurn();
        RpsTurn computerTurn = RpsMenu.getComputerTurn();
        if (RpsTurn.isRegular(userTurn)) {
            RpsMenu.printComputerMoveInfo(computerTurn);
        }
        return RpsMoveComparator.compare(userTurn, computerTurn);
    }
}
