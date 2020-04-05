package org.id.modernjava.functionalprogramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main (String[] args) {
        //printing 2 numbers
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println("x: " + x + " , y: " + y);
        biConsumer.accept(1, 2);

        //calculating sum of 2 integers
        BiConsumer<Integer, Integer> biConsumer1 = (x, y) -> System.out.println("la somme de x+y = " + (x + y));
        biConsumer1.accept(5, 12);

        //concatenate 2 strings
        BiConsumer<String, String> biConsumer2 = (x, y) -> System.out.println(x +" "+ y);
        biConsumer2.accept("Hello", "World");
    }
}
