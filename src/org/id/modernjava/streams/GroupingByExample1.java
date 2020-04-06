package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByExample1 {
  public static void main(String[] args) {
    //group list of words by their length
    Stream<String> stream = Stream.of("money", "bank", "job", "salary", "credit");
    Map<Integer, List<String>> map = stream.collect(Collectors.groupingBy(String::length));
    System.out.println(map);

    System.out.println("-----------------");
    //grouping by instructors by their gender
    Map<String, List<Instructor>> instructorByGender = Instructors.getAll().stream().collect(Collectors.groupingBy(Instructor::getGender));
    System.out.println("instructorByGender = " + instructorByGender);

    System.out.println("-----------------");
    //grouping by experience where >10 years of experience is classified
    //as Senior and others are junior

    Map<String, List<Instructor>> instructorByYearsOfExperience = Instructors.getAll().stream().collect(Collectors.groupingBy(instructor -> instructor.getYearsOfExperience() > 10 ? "senior" : "junior"

    ));
    instructorByYearsOfExperience.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));
  }
}
