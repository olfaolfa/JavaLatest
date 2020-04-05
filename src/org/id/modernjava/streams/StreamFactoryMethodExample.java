package org.id.modernjava.streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {
    public static void main (String[] args) {
        //of
        Stream<Integer> stream = Stream.of(1, 3, 4);
        stream.forEach(System.out::println);

        System.out.println("-----------");
        //iterate generate a stream of 10 even numbers
        Stream<Integer> stream1 = Stream.iterate(1, i -> i * 2).limit(10);
        stream1.forEach(System.out::println);

        System.out.println("--------------");
        //generate 3 random numbers
        Supplier<Integer> supplier = () -> (int) (Math.random() * 145);
        Stream<Integer> stream3 = Stream.generate(supplier).limit(3);
        stream3.forEach(System.out::println);

    }
}
