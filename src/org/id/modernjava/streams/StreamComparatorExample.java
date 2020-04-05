package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    public static void main (String[] args) {

        //retuning all instructors sorted by their name
        List<Instructor> instructors = Instructors.getAll().stream().
                sorted(Comparator.comparing(Instructor::getName)).collect(Collectors.toList());
        instructors.forEach(System.out::println);
    }
}
