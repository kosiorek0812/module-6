package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("LaLaLand", (p) -> p.toUpperCase());
        poemBeautifier.beautify("The Man Who Stared At Goats", (p) -> p.toLowerCase());
        poemBeautifier.beautify("Dead Poets Society", (p) -> "ABC " + p + " ABC");
        poemBeautifier .beautify("abcdefghijklmnopq", (p) -> p.substring(3, 10));



    }
}

