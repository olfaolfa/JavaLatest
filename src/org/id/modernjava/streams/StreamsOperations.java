package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperations {
    public static void main (String[] args) {
        //count distinct
        long countWithDistinct = Instructors.getAll().stream().
                map(Instructor::getCourses).
                flatMap(List::stream).distinct().count();
        System.out.println("number of courses without duplication by use of distinct() = " + countWithDistinct);

        long count = Instructors.getAll().stream().
                map(Instructor::getCourses).
                flatMap(List::stream).count();
        System.out.println("number of courses with duplication without use of distinct() =" + count);

        List<String> coursesWithSorted = Instructors.getAll().stream().
                map(Instructor::getCourses).
                flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
        System.out.println(coursesWithSorted);

        List<String> coursesWithoutSorted = Instructors.getAll().stream().
                map(Instructor::getCourses).
                flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(coursesWithoutSorted);

        //anymatch, allmatch and nonmatch


        boolean match = Instructors.getAll().stream().
                map(Instructor::getCourses).
                flatMap(List::stream).noneMatch(s -> s.startsWith("J"));
        System.out.println(match);


    }
}
