package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PartitioningByExample {
  public static void main(String[] args) {
    //partition instructors in two groups of instructor
    //first is years of experience is > 10 and other is <=10
    Map<Boolean, List<Instructor>> partitionMap = Instructors.getAll().stream().collect(Collectors.partitioningBy(instructor -> instructor.getYearsOfExperience() > 10 ? true : false));
    partitionMap.forEach((key, value) -> {
      System.out.println("key = " + key + " value = " + value);
    });
    System.out.println("-------------------------------");

    //partition but return is set instead of list  }
    Map<Boolean, Set<Instructor>> partitionSet = Instructors.getAll().stream().collect(Collectors.partitioningBy(instructor -> instructor.getYearsOfExperience() > 10 ? true : false, Collectors.toSet()));
    partitionSet.forEach((key, value) -> {
      System.out.println("key = " + key + " value = " + value);
    });
  }
}
