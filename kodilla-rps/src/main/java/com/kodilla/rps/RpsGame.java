package com.kodilla.rps;

public class RpsGame {
    private RpsGameDefinition rpsGameDefinition;
    private int roundNumber;
    private int computerPoints;
    private int gamerPoints;

    public RpsGame(RpsGameDefinition rpsGameDefinition) {
        this.rpsGameDefinition = rpsGameDefinition;
        this.roundNumber = 1;
        this.computerPoints = 0;
        this.gamerPoints = 0;
    }

    public RpsGameDefinition getRpsGameDefinition() {
        return this.rpsGameDefinition;
    }

    public int getRoundNumber() {
        return this.roundNumber;
    }

    public int getComputerPoints() {
        return this.computerPoints;
    }

    public int getGamerPoints() {
        return this.gamerPoints;
    }

    public void play() {

        while (getRoundNumber() <= getRpsGameDefinition().getRounds()) {

            RpsMenu.printRoundInfo(getRoundNumber());
            RpsRoundResult result = RpsRoundRunner.run();
            switch (result) {
                case COMPUTER:
                    RpsMenu.printComputerMoveInfo(RpsMenu.getComputerTurn());
                    this.computerPoints++;
                    break;

                case USER:
                    RpsMenu.printComputerMoveInfo(RpsMenu.getComputerTurn());
                    this.gamerPoints++;
                    break;

                case DRAW:
                    RpsMenu.printComputerMoveInfo(RpsMenu.getComputerTurn());
                    break;

                case REPLAY:
                    RpsMenu.printReplayGameChoice();
                    if (RpsMenu.getReplayGameChoice().equals("y")) {
                        RpsMenu.printGameSummary(getGamerPoints(), getComputerPoints());
                        RpsMenu.printReplayGameInfo();
                        this.roundNumber = 1;
                    }
                    this.roundNumber--;
                    break;

                case END:
                    RpsMenu.printEndGameChoice();
                    if (RpsMenu.getEndGameChoice().equals("y")) {
                        RpsMenu.printGameSummary(getGamerPoints(), getComputerPoints());
                        RpsMenu.printEndGameInfo();
                        System.exit(0);
                    }
                    this.roundNumber--;
                    break;

                case BAD:
                    RpsMenu.printWrongInsertionInfo();
                    break;
            }

            RpsMenu.printResult(result);
            this.roundNumber++;
        }
        RpsMenu.printGameSummary(getGamerPoints(), getComputerPoints());
    }
}
