package org.id.modernjava.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalOfEmptyExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello World");
        System.out.println(optional.orElse(""));
        System.out.println("getWords = " + getWords());
    }

    public static Optional<String> getWords() {
        String[] words = new String[12];
        words[0] = "Hello";
        Optional<String> optional = Optional.of(words[0]);
        if (optional.isPresent()) return optional;
        return Optional.empty();
    }
}
