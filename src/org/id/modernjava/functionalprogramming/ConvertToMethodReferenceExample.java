package org.id.modernjava.functionalprogramming;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {
    public static void main (String[] args) {
        Predicate<Instructor> predicate = ConvertToMethodReferenceExample::haveMoreThanTenYearsExperiences;
        Instructors.getAll().forEach(instructor -> {
            if (predicate.test(instructor))
                System.out.println(instructor);

        });
    }

    public static boolean haveMoreThanTenYearsExperiences (Instructor instructor) {
        return instructor.getYearsOfExperience() > 10;
    }

}
