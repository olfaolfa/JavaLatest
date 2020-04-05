package org.id.modernjava.functionalprogramming;

import java.util.Arrays;
import java.util.Collections;

public class ConstructorReferenceExample {
    public static void main (String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Mkyoung", "Software", "M", 4, Collections.singletonList("Stream Java"), true);
        System.out.println(instructor);
    }
}
