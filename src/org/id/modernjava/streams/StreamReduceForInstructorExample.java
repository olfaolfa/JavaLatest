package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructors;

import java.util.Optional;

public class StreamReduceForInstructorExample {
    public static void main (String[] args) {
        //printing the instructor who has the highest years of experience

        Optional result2 = Instructors.getAll().stream().reduce(((s1, s2) -> s2.getYearsOfExperience() > s1.getYearsOfExperience() ? s2 : s1));
        if (result2.isPresent())
            System.out.println(result2.get());
    }
}
