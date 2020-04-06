package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main (String[] args) {
        System.out.println(Stream.of("H", "E", "L", "L", "O").collect(Collectors.joining()));
        System.out.println(Stream.of("HELLO", "WORLD").collect(Collectors.joining(" ")));
        System.out.println(Stream.of("HELLO", "WORLD").collect(Collectors.joining(" ", "{", "}")));
        //instructors names seperated by , and prefix { and suffix }
        String namesConcatenated = Instructors.getAll().stream().map(Instructor::getName).
                collect(Collectors.joining(",", "{", "}"));
        System.out.println("namesConcatenated = " + namesConcatenated);
    }
}
