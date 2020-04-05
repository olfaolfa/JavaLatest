package org.id.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInstructor {
    public static void main (String[] args) {

        List<Instructor> instructors = Instructors.getAll();
        //looping trough all instructor and print out the value of instructor
        Consumer<Instructor> allValuesConsumer = System.out::println;
        instructors.forEach(allValuesConsumer);

        //looping trough all instructors and print out their name
        Consumer<Instructor> nameConsumer = (x) -> System.out.println(x.getName());
        instructors.forEach(nameConsumer);

        //looping trough all instructors and print out their names and theeir courses
        Consumer<Instructor> coursesConsumer = (x) -> System.out.println("Courses are :" + x.getCourses());
        instructors.forEach(nameConsumer.andThen(coursesConsumer));

        //looping trough all instructors and print out their names if the nbr of experiences > 10
        Consumer<Instructor> consumer = (x) -> {
            if (x.getYearsOfExperience() > 10)
                nameConsumer.accept(x);
        };

        instructors.forEach(consumer);


    }
}
