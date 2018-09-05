package com.kodilla.rps;

public class RpsRoundRunner {

    public static RpsRoundResult run() {

        RpsMenu.printShortMenu();
        RpsTurn userTurn = RpsMenu.getUserTurn();
        RpsTurn computerTurn = RpsMenu.getComputerTurn();

        return RpsMoveComparator.compare(userTurn, computerTurn);
    }
}
