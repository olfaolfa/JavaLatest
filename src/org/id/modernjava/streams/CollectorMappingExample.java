package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorMappingExample {
  public static void main(String[] args) {
    //collecting names of instructors using map
    Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.toList()).forEach(System.out::println);
    //using mapping
    System.out.println("------------ using Collectors mapping --------------");
    Instructors.getAll().stream().collect(Collectors.mapping(Instructor::getName, Collectors.toList())).forEach(System.out::println);

    //Instructors by their years of experience
    Map<Integer, List<String>> mapYearsOfExperienceAndNames = Instructors.getAll().stream().collect(Collectors.groupingBy(Instructor::getYearsOfExperience, Collectors.mapping(Instructor::getName, Collectors.toList())));
    mapYearsOfExperienceAndNames.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));
  }
}
