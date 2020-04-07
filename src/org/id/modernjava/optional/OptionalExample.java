package org.id.modernjava.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[12];

        Optional<Integer> optional = Optional.ofNullable(numbers[0]);
        System.out.println(optional.orElse(-1));

        //int number = numbers[0];
        //System.out.println("number = " + number);

    }
}
