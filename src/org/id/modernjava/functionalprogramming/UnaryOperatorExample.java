package org.id.modernjava.functionalprogramming;

import java.util.function.*;

public class UnaryOperatorExample {
    public static void main (String[] args) {
        UnaryOperator<Integer> unaryOperator = i -> i * 12;
        System.out.println("result with UnaryOperator =  " + unaryOperator.apply(12));

        Function<Integer, Integer> function = i -> i * 12;
        System.out.println("result with Function =  " + function.apply(12));

        IntUnaryOperator intUnaryOperator = i -> i * 12;
        System.out.println("result with IntUnaryOperator =  " + intUnaryOperator.applyAsInt(12));

        DoubleUnaryOperator doubleUnaryOperator = i -> i * 12;
        System.out.println("result with DoubleUnaryOperator =  " + doubleUnaryOperator.applyAsDouble(12.1));

        LongUnaryOperator longUnaryOperator = i -> i * 12;
        System.out.println("result with longUnaryOperator =  " + longUnaryOperator.applyAsLong(1222222L));


    }
}
