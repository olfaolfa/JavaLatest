package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class CollectorSummingAveragingExample {
  public static void main(String[] args) {
    //sum of years of experience of all instructor
    int sum = Instructors.getAll().stream().mapToInt(Instructor::getYearsOfExperience).sum();
    System.out.println("sum = " + sum);
    int sum1 = Instructors.getAll().stream().collect(Collectors.summingInt(Instructor::getYearsOfExperience));
    System.out.println("sum1 = " + sum1);

    //average of years of experience of all instructor
    OptionalDouble average = Instructors.getAll().stream().mapToInt(Instructor::getYearsOfExperience).average();
    System.out.println(average.getAsDouble());
    Double average1 = Instructors.getAll().stream().collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
    System.out.println(average1);
  }
}
