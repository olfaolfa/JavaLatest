package org.id.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitAndSkipExample {
    public static void main (String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numbers.stream().limit(3).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-----");
        numbers.stream().skip(3).collect(Collectors.toList()).forEach(System.out::println);

    }
}
