package org.id.modernjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectionExample {
    public static void main (String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Olfa");
        names.add("Mehdi");
        names.add("Khalil");
        System.out.println("-----------------");
        System.out.println(names);


        System.out.println("-----------------");
        names.remove("Olfa");
        System.out.println(names);
        for (String name : names)
            System.out.println(name);
        System.out.println("-----------------");
        for (String name : names)
            System.out.println(name);
        System.out.println("-----------------");
        for (String name : names)
            System.out.println(name);
        System.out.println("-----------------");
        Stream<String> streamNames = names.stream();
      //  streamNames.forEach(System.out::println);

        List<String> list = streamNames.filter(s -> s.startsWith("M")).collect(Collectors.toList());
        System.out.println(list);

    }
}
