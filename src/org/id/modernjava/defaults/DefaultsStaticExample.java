package org.id.modernjava.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultsStaticExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Gene", "Mike", "Jenny");
        //java7
        // Collections.sort(names);
        // System.out.println("names = " + names);
        //java8
        names.sort(Comparator.naturalOrder());
        System.out.println("names = " + names);

    }
}
