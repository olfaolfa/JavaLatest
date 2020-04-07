package org.id.modernjava.defaults;

@FunctionalInterface
public interface Calculator {
    int sum(int a, int b);

    //default method which is subtract
    default int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

}
