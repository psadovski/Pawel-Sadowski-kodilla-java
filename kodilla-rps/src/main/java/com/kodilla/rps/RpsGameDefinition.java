package com.kodilla.rps;

public class RpsGameDefinition {
    private final String name;
    private final int rounds;

    public RpsGameDefinition(final String name, final int rounds) {
        this.name = name;
        this.rounds = rounds;
    }

    public String getName() {
        return this.name;
    }

    public int getRounds() {
        return this.rounds;
    }
}
