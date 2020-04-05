package org.id.modernjava.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionForInstructorExample {
    public static void main (String[] args) {
        //Bifuction 2 inputs List<Instructors> and second is predicate which will filter if instructor has online
        //courses and return a map of <String,Integer> string is name and Integer is the years of experience
        Map<String, Integer> map = new HashMap<>();
        //Predicate will return true if instructor has online courses
        Predicate<Instructor> predicateIsOnlineCourses = Instructor::isOnlineCourses;
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> function = (instructors, predicate) -> {
            instructors.forEach(instructor -> {
                if (predicate.test(instructor))
                    map.put(instructor.getName(), instructor.getYearsOfExperience());
            });
            return map;
        };
        System.out.println(function.apply(Instructors.getAll(), predicateIsOnlineCourses));
    }
}
