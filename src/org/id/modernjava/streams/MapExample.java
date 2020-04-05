package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
    public static void main (String[] args) {
        //return only instructor names from the instructor list
        Set<String> instructorNames = Instructors.getAll().stream().map(Instructor::getName).map(String::toUpperCase).collect(Collectors.toSet());
        System.out.println(instructorNames);
    }
}
