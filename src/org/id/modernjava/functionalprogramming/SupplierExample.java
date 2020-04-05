package org.id.modernjava.functionalprogramming;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main (String[] args) {
        Supplier<Integer> supplier1 = () -> (int) (Math.random() * 1000);
        System.out.println(supplier1.get());
    }
}
