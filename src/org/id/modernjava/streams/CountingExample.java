package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.stream.Collectors;

public class CountingExample {
    public static void main (String[] args) {
        //count the numbers of instructors who teaches online courses
        //stream.count
        System.out.println(Instructors.getAll().stream().filter(Instructor::isOnlineCourses).count());

        //collectors.counting
        System.out.println(Instructors.getAll().stream().filter(Instructor::isOnlineCourses).collect(Collectors.counting()));
    }
}
