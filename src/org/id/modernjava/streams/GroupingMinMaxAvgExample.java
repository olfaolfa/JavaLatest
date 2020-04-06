package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingMinMaxAvgExample {
  public static void main(String[] args) {
    //grouping the instructors in two sets of online course vs not online
    //and get the max years of experience of the instructors
    Map<Boolean, Optional<Instructor>> map=
            Instructors.getAll().stream().collect(
                    Collectors.groupingBy(Instructor::isOnlineCourses,
                            Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience))));
    map.forEach((aBoolean, optionalInstructor) -> System.out.println("key = "+aBoolean+" value =  "+optionalInstructor.get()));

    //collectingAndThen
    Map<Boolean, Instructor> map1=
            Instructors.getAll().stream().collect(
                    Collectors.groupingBy(Instructor::isOnlineCourses,Collectors.collectingAndThen(
                            Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)),Optional::get)));
    map1.forEach((aBoolean, instructor) -> System.out.println("key = "+aBoolean+" value =  "+instructor));

    //average years of experience of instructors who teaches online or not
    Map<Boolean, Double> map2=
            Instructors.getAll().stream().collect(
                    Collectors.groupingBy(Instructor::isOnlineCourses,
                            Collectors.averagingInt(Instructor::getYearsOfExperience)));
    map2.forEach((key, value) -> System.out.println("key = "+key+" value =  "+value));


    //drive a statistical summary from properties of grouped items

    Map<Boolean, IntSummaryStatistics> map3=
            Instructors.getAll().stream().collect(
                    Collectors.groupingBy(Instructor::isOnlineCourses,
                            Collectors.summarizingInt(Instructor::getYearsOfExperience)));
    map3.forEach((key, value) -> System.out.println("key " +
            "= "+key+" value =  "+value));


  }

}
