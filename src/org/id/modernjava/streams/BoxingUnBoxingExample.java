package org.id.modernjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingExample {
    public static void main (String[] args) {
        List<Integer> numbers;
        IntStream numStream = IntStream.rangeClosed(0, 13); //primitive int stream
        //convert numStream to numbers( convert int to Integer)
        numbers = numStream.boxed().collect(Collectors.toList()); //box
        numbers.forEach(System.out::println);

        // convert  Integer to int
        numbers.stream().mapToInt(Integer::intValue).forEach(System.out::println); //unboxing

    }
}
