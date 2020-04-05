package org.id.modernjava.functionalprogramming;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class IntDoubleLongPredicateExample {
    public static void main (String[] args) {
        IntPredicate intPredicate = i -> i > 25;
        System.out.println(intPredicate.test(12));
        DoublePredicate doublePredicate = d -> d > 100.23;
        System.out.println(doublePredicate.test(100.24));
        LongPredicate longPredicate = l -> l > 100L;
        System.out.println(longPredicate.test(1111111L));
    }
}

