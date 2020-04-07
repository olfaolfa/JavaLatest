package org.id.modernjava.optional;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class OptionalOrElseThrowExample {
    public static void main(String[] args) {
        //orElse
        Integer[] numbers = new Integer[12];
        //numbers[0] = 5;
        Optional<Integer> optional = Optional.ofNullable(numbers[0]);
        System.out.println("optional = " + optional.orElse(-1));

        //orElseGet
        System.out.println("optional with orElseGet = " + optional.orElseGet(() -> ThreadLocalRandom.current().nextInt(15)));
        System.out.println("optional with orElseGet = " + optional.orElseGet(() -> -1));

        //orElseThrow
        try {
            System.out.println("result orElseThrow = " + optional.orElseThrow(Exception::new));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
