package org.id.modernjava.functionalprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    public static void main (String[] args) {
        //calculating sum of 2 numbers
        BinaryOperator<Integer> binaryOperator = Integer::sum;
        System.out.println("sum of 2 numbers using BinaryOperator : " + binaryOperator.apply(1, 2));

        //calculate  max of 2 numbers
        Comparator<Integer> comparator = Integer::compare;
        System.out.println("max of 2 numbers using maxBy in BinaryOperator :  " + BinaryOperator.maxBy(comparator).apply(1, 2));

        //calculate  min of 2 numbers
        System.out.println("max of 2 numbers using minBy in BinaryOperator :  " + BinaryOperator.minBy(Integer::compare).apply(1, 2));

        IntBinaryOperator intBi = (a, b) -> a * b;
        System.out.println(intBi.applyAsInt(2, 4));

        LongBinaryOperator longBi = (a, b) -> a * b;
        System.out.println(longBi.applyAsLong(20000000L, 22222222222222222L));

        DoubleBinaryOperator doubleBi = (a, b) -> a * b;
        System.out.println(doubleBi.applyAsDouble(2222.22222, 22222222222222.22222));
    }
}
