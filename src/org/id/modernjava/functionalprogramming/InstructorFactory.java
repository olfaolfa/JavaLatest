package org.id.modernjava.functionalprogramming;


import java.util.List;

@FunctionalInterface
public interface InstructorFactory {
    public Instructor getInstructor (String name, String title, String gender, int yearsOfExperience, List<String> courses, boolean onlineCourse);
}
