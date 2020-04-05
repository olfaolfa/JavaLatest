package org.id.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample1 {
    public static void main (String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //print out name and gender of instructors
        BiConsumer<String, String> biConsumerForNameAndGender = (n, g) -> System.out.println("name = " + n + " ,gender = " + g);
        instructors.forEach(instructor -> biConsumerForNameAndGender.accept(instructor.getName(), instructor.getGender()));

        //print out name and list of courses
        System.out.println("--------------------");
        BiConsumer<String, List<String>> biConsumerForNameAndCourses = (name, courses) -> System.out.println("name = " + name + " ,list of courses is  = " + courses);
        instructors.forEach(instructor -> biConsumerForNameAndCourses.accept(instructor.getName(), instructor.getCourses()));

        //print out name and gender of all instructors who teaches online
        System.out.println("----------------------");
        instructors.forEach(instructor -> {
            if (instructor.isOnlineCourses())
                biConsumerForNameAndGender.accept(instructor.getName(), instructor.getGender());
        });
    }

}
