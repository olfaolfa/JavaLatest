package org.id.modernjava.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main (String[] args) {
        Consumer<String> consumer = (x) -> System.out.println(x.length() + " the value is " + x);
        consumer.accept("Hello World");

        //consumer with bloc statement
        Consumer<List<String>> consumer1 = (x) -> {
            for (String elt : x) {
                System.out.println(elt.toUpperCase());
            }
        };
        consumer1.accept(Arrays.asList("hello","world"));
    }

}
