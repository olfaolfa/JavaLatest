package org.id.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {
    public static void main (String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //all instructor who teaches online
        Predicate<Instructor> predicate = Instructor::isOnlineCourses;
        //instructor experience is >10 years
        Predicate<Instructor> predicate1 = (instructor) -> instructor.getYearsOfExperience() > 10;

        //Biconsumer print name and courses
        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("name is " + name + " , courses are :" + courses);
        instructors.forEach(instructor -> {
            if (predicate.and(predicate1).test(instructor))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        });
    }
}
