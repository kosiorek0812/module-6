package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String poem, PoemDecorator decorator) {
        String poemBeautified;
        poemBeautified = decorator.decorate(poem);
        return poemBeautified;

    }
}
