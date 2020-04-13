package org.id.modernjava.javaimprovements;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Java11VarWithLambdaExample {
    public static void main(String[] args) {
        var instructors = Instructors.getAll();
        Predicate<Instructor> predicate = (var instructor) -> instructor.getYearsOfExperience() > 10;
        instructors.forEach((var instructor) -> {
            if (predicate.test(instructor)) {
                var rs = instructor.getName();
                System.out.println("instructor name = " + rs);
            }
        });
        BiFunction<Integer, Integer, Integer> sum = (var x, var y) -> x + y;
        System.out.println("sum= " + sum.apply(1, 5));
    }
}
