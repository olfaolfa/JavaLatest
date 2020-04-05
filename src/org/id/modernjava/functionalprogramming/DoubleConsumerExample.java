package org.id.modernjava.functionalprogramming;

import java.util.function.DoubleConsumer;

public class DoubleConsumerExample {
    public static void main (String[] args) {
        DoubleConsumer doubleConsumer = (a) -> System.out.println(a * 10);
        doubleConsumer.accept(0.2);
    }
}
