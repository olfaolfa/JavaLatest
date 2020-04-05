package org.id.modernjava.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduceExample {
    public static void main (String[] args) {
        Stream<Integer> numbers = Stream.of(1, 3, 6, 9, 5);

        //sum of all elts 1+3+6+9+5=24
        //0+1=1
        //1+3=4
        //4+6=10
        //10+9=19
        //19+5=24
        Integer sumOfAllElements = numbers.reduce(0, Integer::sum);
        System.out.println(sumOfAllElements);

        // * of all elts 1*3*6*9*5
        //1*1=1 1*3=3 3*6=18 18*9=162 162*5=810
        Integer res = Stream.of(1, 3, 6, 9, 5).reduce(1, (a, b) -> a * b);
        System.out.println(res);

        Optional result2 = Stream.of(1, 3, 6, 9, 5).reduce(Integer::sum);
        System.out.println("--------");
        if(result2.isPresent())
            System.out.println(result2.get());
    }
}
