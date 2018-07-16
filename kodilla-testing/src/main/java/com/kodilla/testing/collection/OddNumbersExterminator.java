package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        if (numbers == null) {
            return null;
        } else {
            List<Integer> tmp = new ArrayList<>();

            for (Integer exterminated : numbers) {
                if (exterminated % 2 == 0) {
                    tmp.add(exterminated);
                }
            }
            return tmp;
        }
    }
}
