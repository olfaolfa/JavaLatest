package org.id.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    public static void main (String[] args) {
        List<Integer> numbers = Arrays.asList(8, 9, 77, 5, 54);
        //Stream min function
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        min.ifPresent(System.out::println);

        //reduce function
        //(0,1) - 0  //(0,3) - 0
        //(0,2) - 0
        Integer reduceMin = numbers.stream().reduce(0, Integer::min);//print 0 so use reduce Optional
        System.out.println(reduceMin);

        Optional<Integer> op1 = numbers.stream().reduce(Integer::min);
        op1.ifPresent(System.out::println);
        Optional<Integer> op2 = numbers.stream().reduce((a, b) -> a < b ? a : b);
        op2.ifPresent(System.out::println);

    }
}
