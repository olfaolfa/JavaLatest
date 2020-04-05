package org.id.modernjava.functionalprogramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll () {
        Instructor instructor1 = new Instructor("Olfa", "Fullstack Developer", "F", 4, Arrays.asList("Spring Batch", "Java 8"), true);
        Instructor instructor2 = new Instructor("Mehdi", "Team Learder", "M", 8, Arrays.asList("Spring Cloud", "Micro Services"), true);
        Instructor instructor3 = new Instructor("Mohamed", "Manager", "M", 12, Collections.singletonList("Multi Thread"), true);
        Instructor instructor4 = new Instructor("Khalil", "Tester", "M", 2, Arrays.asList("Mock", "Unit Test", "Java 8"), false);
        return Arrays.asList(instructor1, instructor2, instructor3, instructor4);
    }
}
