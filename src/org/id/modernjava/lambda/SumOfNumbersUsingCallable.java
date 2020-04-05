package org.id.modernjava.lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.Callable;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfNumbersUsingCallable {
    public static int[] array = IntStream.rangeClosed(0, 5000).toArray();
    public static int total = IntStream.rangeClosed(0, 5000).sum();

    public static void main (String[] args) throws Exception {
        Callable callable = () -> {
            int sum = 0;
            for (int i = 0; i < array.length; i++)
                sum += array[i];
            return sum;
        };
        System.out.println("Sum from Callable is  " + callable.call());
        System.out.println("Correct sum of intStream is " + total);
    }


}
