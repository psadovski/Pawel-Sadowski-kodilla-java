package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Ala ma kota", (text) -> "ABC_" + text + "_ABC");
        poemBeautifier.beautify("Kot ma na imię Tom", (text -> text.toUpperCase()));
        poemBeautifier.beautify("Kot Ali ma na imię Tom", (text -> text.toLowerCase()));
        poemBeautifier.beautify("ala ma kota", (text -> text.replace("a", "A")));
        poemBeautifier.beautify("Java is the best", (text -> text.trim()));
    }
}