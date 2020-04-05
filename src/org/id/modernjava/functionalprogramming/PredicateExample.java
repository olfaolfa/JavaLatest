package org.id.modernjava.functionalprogramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main (String[] args) {
        //if number is >10 return true other false
        Predicate<Integer> predicate = (n) -> n > 10;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(15));

        //i>10 && number is even number (i%2 ==0)
        Predicate<Integer> predicate1 = (n) -> n % 2 == 0;
        System.out.println(predicate.and(predicate1).test(10));

        //i>10 || number is even number (i%2==0)
        System.out.println(predicate.or(predicate1).test(10));

        //i>10 && i%2 !=0
        System.out.println(predicate.and(predicate1.negate()).test(10));

    }
}
