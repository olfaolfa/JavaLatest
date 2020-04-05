package org.id.modernjava.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class DoubleStreamExample {
    public static void main (String[] args) {
        DoubleStream numbers = IntStream.range(1, 5).asDoubleStream();
        numbers.forEach(System.out::println);

        numbers = IntStream.rangeClosed(1, 5).asDoubleStream();
        numbers.forEach(System.out::println);
    }
}
