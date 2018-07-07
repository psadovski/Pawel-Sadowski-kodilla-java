package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.kodilla.good.patterns.challenges.MovieStore.getMovies;

public class MovieStoreRunner {

    public static void main(String[] args) {
        Map<String, List<String>> storeMap = new HashMap<>(getMovies());

        String collect = storeMap.entrySet()
                .stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(collect);
    }
}
