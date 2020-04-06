package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingExample2 {
  public static void main(String[] args) {
    //grouping by length of string and also checking that the names contains e
    //and only return those name which has a in it
    Stream<String> stream = Stream.of("money", "bank", "job", "salary", "credit");
    Map<Integer, List<String>> map = stream.collect(Collectors.groupingBy(String::length, Collectors.filtering(s -> s.contains("a"), Collectors.toList())));
    map.forEach((key, value) -> System.out.println("key =" + " " + key + " value = " + value));

    System.out.println("------------------");

    //instructor grouping them by Senior(>10) and Junior(<10) and filter them
    //on online courses

    Map<String, List<Instructor>> instructorByYearsOfExperience = Instructors.getAll().stream().collect(Collectors.groupingBy(instructor -> instructor.getYearsOfExperience() > 10 ? "senior" : "junior", Collectors.filtering(Instructor::isOnlineCourses, Collectors.toList())

    ));
    instructorByYearsOfExperience.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));


  }
}
