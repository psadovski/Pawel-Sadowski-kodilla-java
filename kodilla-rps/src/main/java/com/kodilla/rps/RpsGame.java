package com.kodilla.rps;

public class RpsGame {
    private static RpsGameDefinition rpsGameDefinition;
    private static int roundNumber;

    public RpsGame(RpsGameDefinition rpsGameDefinition) {
        this.rpsGameDefinition = rpsGameDefinition;
        this.roundNumber = 1;
    }

    public RpsGameDefinition getRpsGameDefinition() {
        return this.rpsGameDefinition;
    }

    public static void play() {
        while (roundNumber <= rpsGameDefinition.getRounds()) {

            RpsMenu.printRoundInfo(roundNumber);
            RpsMenu.printShortMenu();
            RpsTurn userTurn = RpsMenu.getUserTurn();

            if (userTurn == RpsTurn.ROCK || userTurn == RpsTurn.PAPER || userTurn == RpsTurn.SCISSORS ) {
                RpsRoundRunner.run(userTurn);
                roundNumber++;
            } else if (userTurn == RpsTurn.END) {
                RpsMenu.printGameSummary(RpsRoundRunner.gamerPoints, RpsRoundRunner.computerPoints);
                RpsMenu.printEndGameInfo();
                System.exit(0);
            } else  if (userTurn == RpsTurn.REPLAY) {
                RpsMenu.printGameSummary(RpsRoundRunner.gamerPoints, RpsRoundRunner.computerPoints);
                RpsMenu.printReplayGameInfo();
                roundNumber = 1;
            } else {
                RpsMenu.printWrongInsertionInfo();
            }
        }

        RpsMenu.printGameSummary(RpsRoundRunner.gamerPoints, RpsRoundRunner.computerPoints);
    }
}
