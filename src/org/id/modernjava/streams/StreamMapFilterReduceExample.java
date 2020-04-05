package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.Optional;

public class StreamMapFilterReduceExample {
    public static void main (String[] args) {
        //total years of experience between instructors who has online courses
        Integer res = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .map(Instructor::getYearsOfExperience).reduce(0,Integer::sum);
            System.out.println(res);
    }
}
