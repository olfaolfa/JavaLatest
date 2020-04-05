package org.id.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
    public static void main (String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        //max using stream max function
        Optional maxNumber = numbers.stream().max(Integer::compareTo);
        if (maxNumber.isPresent())
            System.out.println(maxNumber.get());
        //(0,1) - 1   // return 0
        //(1,2) - 2
        //(2,3) - 3
        int res = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(res);
        Optional res1 = numbers.stream().reduce((a, b) -> a > b ? a : b);
        if (res1.isPresent())
            System.out.println(res1.get());


        Optional res3 = numbers.stream().reduce(Integer::max);
        if (res3.isPresent())
            System.out.println(res3.get());
    }
}
