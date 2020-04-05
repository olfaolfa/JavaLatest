package org.id.modernjava.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main (String[] args) {
        System.out.println("sum of 1000 numbers is: " + IntStream.rangeClosed(0, 1000).sum());
        OptionalInt min = IntStream.rangeClosed(0, 1000).min();
        if (min.isPresent())
            System.out.println("Minimum of 1000 numbers is: " + min.getAsInt());
        OptionalInt max = IntStream.rangeClosed(0, 1000).max();
        if (max.isPresent())
            System.out.println("Max of 1000 numbers is: " + max.getAsInt());

        OptionalDouble average = LongStream.rangeClosed(0, 1000).average();
        if (average.isPresent())
            System.out.println("Average is: " + average.getAsDouble());


    }
}
