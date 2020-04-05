package org.id.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main (String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        //all instructor who teaches online and experience is >10 years
        BiPredicate<Boolean, Integer> predicate = (isOnline, numberOfExperience) -> isOnline && numberOfExperience > 10;
        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("name is " + name + " , courses are :" + courses);

        //Biconsumer print name and courses
      /*  instructors.forEach(instructor -> {
            if (predicate.test(instructor.isOnlineCourses(), instructor.getYearsOfExperience()))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        });*/

        instructors.stream().filter(instructor -> predicate.test(instructor.isOnlineCourses(), instructor.getYearsOfExperience())).forEach(instructor -> biConsumer.accept(instructor.getName(), instructor.getCourses()));


    }
}
