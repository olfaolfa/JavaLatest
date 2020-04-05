package org.id.modernjava.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionForInstructor {
    public static void main (String[] args) {
        //Map of instructors with name and years of experience
        //Function which will take List<Instructors> and return a Map<String, Integer>
        Map<String, Integer> map = new HashMap<>();
        //Predicate will return true if instructor has online courses
        Predicate<Instructor> predicate = Instructor::isOnlineCourses;
        Function<List<Instructor>, Map<String, Integer>> function1 = (instructors) -> {
            instructors.forEach(instructor -> {
                if (predicate.test(instructor))
                    map.put(instructor.getName(), instructor.getYearsOfExperience());
            });
            return map;
        };
        System.out.println(function1.apply(Instructors.getAll()));

    }
}
