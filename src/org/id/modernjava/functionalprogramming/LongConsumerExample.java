package org.id.modernjava.functionalprogramming;

import java.util.function.LongConsumer;

public class LongConsumerExample {
    public static void main (String[] args) {
        LongConsumer longConsumer = (a) -> System.out.println(a * 10L);
        longConsumer.accept(10L);
    }

}
