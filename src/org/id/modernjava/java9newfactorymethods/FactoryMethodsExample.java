package org.id.modernjava.java9newfactorymethods;


import java.util.*;

public class FactoryMethodsExample {
    public static void main(String[] args) {
        //How we used to create unmodifiable list pre Java 9
        List<String> names = new ArrayList<>();
        names.add("aa");
        names.add("bb");
        names.add("cc");
        names = Collections.unmodifiableList(names);
        System.out.println("names = " + names);
        //names.add("ff"); UnsupportedOperationException

        //factory methods of Java 9
        List<String> words = List.of("bank", "money", "house");
        System.out.println("words = " + words);
        Set<String> set = Set.of("bank", "money", "house");
        System.out.println("set = " + set);
        Map<Integer, String> map = Map.of(1, "bank", 2, "house");
        System.out.println("map = " + map);
        //modify the list
        //  words.add("salary"); UnsupportedOperationException
        //set = Set.of("bank", "money", "house", "bank","money", "house"); java.lang.IllegalArgumentException: duplicate element: bank
        //words.sort(Comparator.naturalOrder()); UnsupportedOperationException

    }
}
