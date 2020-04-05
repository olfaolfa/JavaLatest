package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main (String[] args) {
        //creating a map of names and course of instructors who teaches
        //online have more than 10 years of experience

        Predicate<Instructor> p1 = Instructor::isOnlineCourses;
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;
        System.out.println( Instructors.getAll().stream().filter(p1).filter(p2));
        Map<String, List<String>> map = Instructors.getAll().stream()
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
        System.out.println(map);
    }
}
