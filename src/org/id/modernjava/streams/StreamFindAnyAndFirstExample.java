package org.id.modernjava.streams;

import org.id.modernjava.functionalprogramming.Instructor;
import org.id.modernjava.functionalprogramming.Instructors;

import java.util.Optional;

public class StreamFindAnyAndFirstExample {
    public static void main (String[] args) {
        Optional<Instructor> first = Instructors.getAll().stream().findFirst();
        if (first.isPresent())
            System.out.println(first.get());
        Optional<Instructor> any = Instructors.getAll().stream().findAny();
        if (any.isPresent())
            System.out.println(any.get());


    }
}
