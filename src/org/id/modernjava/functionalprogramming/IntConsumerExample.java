package org.id.modernjava.functionalprogramming;

import java.util.function.IntConsumer;

public class IntConsumerExample {
    public static void main (String[] args) {
        IntConsumer intConsumer = (a) -> System.out.println(a * 10);
        intConsumer.accept(2);
    }
}
