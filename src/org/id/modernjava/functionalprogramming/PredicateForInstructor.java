package org.id.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateForInstructor {
    public static void main (String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //all instructor who teaches online
        Predicate<Instructor> predicate = Instructor::isOnlineCourses;
        //instructor experience is >10 years
        Predicate<Instructor> predicate1 = (instructor) -> instructor.getYearsOfExperience() > 10;
        instructors.forEach(instructor -> {
            if (predicate.test(instructor))
                System.out.println(instructor);
        });

        System.out.println("---------------------");
        // is instructor teaches online and exprience is > 10 years
        instructors.forEach(instructor -> {
            if (predicate.and(predicate1).test(instructor))
                System.out.println(instructor);
        });
    }
}
