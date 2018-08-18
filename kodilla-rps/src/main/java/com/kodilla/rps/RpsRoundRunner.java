package com.kodilla.rps;

public class RpsRoundRunner {
    public static int computerPoints;
    public static int gamerPoints;

    public RpsRoundRunner() {
        this.computerPoints = 0;
        this.gamerPoints = 0;
    }

    public int getComputerPoints() {
        return this.computerPoints;
    }

    public int getGamerPoints() {
        return this.getGamerPoints();
    }

    public static void run(RpsTurn userTurn) {

        RpsTurn computerTurn = RpsMenu.getComputerTurn();
        RpsMenu.printComputerMoveInfo(computerTurn);
        RpsRoundResult result = RpsMoveComparator.compare(userTurn, computerTurn);
        RpsMenu.printResult(result);

        if (result == RpsRoundResult.COMPUTER) {
            computerPoints++;
        }

        if (result == RpsRoundResult.USER) {
            gamerPoints++;
        }
    }
}
