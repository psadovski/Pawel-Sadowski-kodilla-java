package com.kodilla.rps;

public class RpsGame {
    private RpsGameDefinition rpsGameDefinition;
    private int computerPoints;
    private int gamerPoints;
    private int draws;

    public RpsGame(RpsGameDefinition rpsGameDefinition) {
        this.rpsGameDefinition = rpsGameDefinition;
        this.computerPoints = 0;
        this.gamerPoints = 0;
        this.draws = 0;
    }

    public RpsGameDefinition getRpsGameDefinition() {
        return this.rpsGameDefinition;
    }

    public int getComputerPoints() {
        return this.computerPoints;
    }

    public int getGamerPoints() {
        return this.gamerPoints;
    }

    public int getDraws() {
        return this.draws;
    }

    public void play() {

        int roundNumber = 1;
        boolean shouldContinue = true;

        while (roundNumber <= getRpsGameDefinition().getRounds() && shouldContinue) {
            RpsRoundRunner rpsRoundRunner = new RpsRoundRunner(roundNumber);
            RpsRoundResult result = rpsRoundRunner.run();
            switch (result) {
                case COMPUTER:
                    actualizePoints(result);
                    break;

                case USER:
                    actualizePoints(result);
                    break;

                case DRAW:
                    actualizePoints(result);
                    break;

                case REPLAY:
                    RpsMenu.printReplayGameChoice();
                    if (RpsMenu.getReplayGameChoice().equals("y")) {
                        RpsMenu.printGameSummary(getGamerPoints(), getComputerPoints(), getDraws());
                        RpsMenu.printReplayGameInfo();
                        roundNumber = 1;
                    }
                    roundNumber--;
                    break;

                case END:
                    RpsMenu.printEndGameChoice();
                    if (RpsMenu.getEndGameChoice().equals("y")) {
                        RpsMenu.printEndGameInfo();
                        shouldContinue = false;
                    }
                    roundNumber--;
                    break;

                case BAD:
                    RpsMenu.printWrongInsertionInfo();
                    roundNumber--;
                    break;
            }

            RpsMenu.printResult(result);
            roundNumber++;
        }
        RpsMenu.printGameSummary(getGamerPoints(), getComputerPoints(), getDraws());
    }

    private void actualizePoints(RpsRoundResult result) {
        if (result == RpsRoundResult.COMPUTER) {
            this.computerPoints++;
        }

        if (result == RpsRoundResult.USER) {
            this.gamerPoints++;
        }

        if (result == RpsRoundResult.DRAW) {
            this.draws++;
        }
    }
}
