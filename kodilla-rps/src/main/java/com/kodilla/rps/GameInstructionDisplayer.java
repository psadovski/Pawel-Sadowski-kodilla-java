package com.kodilla.rps;

public class GameInstructionDisplayer {
    private static final String CASE1 = "Botton '1' - choose Rock \n";
    private static final String CASE2 = "Botton '2' - choose Paper \n";
    private static final String CASE3 = "Botton '3' - choose Scissors \n";
    private static final String CASE4 = "Botton '4' - choose Spock \n";
    private static final String CASE5 = "Botton '5' - choose Lizard \n";
    private static final String GAMEEND = "Press 'x' to end the game \n";
    private static final String REPLAY = "Press 'n' to replay the game \n";


    public String displayInstruction() {
        return String.format(CASE1 + CASE2 + CASE3 + CASE4 + CASE5 + GAMEEND + REPLAY);
    }
}
