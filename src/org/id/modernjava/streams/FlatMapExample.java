package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main (String[] args) {
        //Get a list of all the courses which instructors offers
        Set<String> courses= Instructors.getAll().stream().
                map(Instructor::getCourses).
                flatMap(List::stream).
                collect(Collectors.toSet());
        System.out.println(courses);
    }
}
