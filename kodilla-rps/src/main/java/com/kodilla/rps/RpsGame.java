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

        boolean shouldContinue = true;

        while (getRoundNumber() <= getRpsGameDefinition().getRounds() && shouldContinue) {
            RpsRoundRunner rpsRoundRunner = new RpsRoundRunner(getRoundNumber());
            RpsRoundResult result = rpsRoundRunner.run();
            switch (result) {
                case COMPUTER:
                    this.computerPoints++;
                    break;

                case USER:
                    this.gamerPoints++;
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
                        RpsMenu.printEndGameInfo();
                        shouldContinue = false;
                    }
                    this.roundNumber--;
                    break;

                case BAD:
                    RpsMenu.printWrongInsertionInfo();
                    this.roundNumber--;
                    break;
            }

            RpsMenu.printResult(result);
            this.roundNumber++;
        }
        RpsMenu.printGameSummary(getGamerPoints(), getComputerPoints());
    }
}
