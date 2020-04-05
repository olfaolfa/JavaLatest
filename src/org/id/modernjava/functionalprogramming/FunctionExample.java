package org.id.modernjava.functionalprogramming;

import java.util.function.Function;

public class FunctionExample {
    public static void main (String[] args) {
        Function<Integer, Double> sqrt = Math::sqrt;
        System.out.println("Square root of 4: " + sqrt.apply(4));
        Function<String, String> lowerCaseFunction = String::toLowerCase;
        System.out.println(lowerCaseFunction.apply("PROGRAMMING"));

        Function<String, String> concatFunction = s -> s.concat(" IN JAVA");
        System.out.println(lowerCaseFunction.andThen(concatFunction).apply("PROGRAMMING"));
        System.out.println(lowerCaseFunction.compose(concatFunction).apply("PROGRAMMING"));


    }
}
