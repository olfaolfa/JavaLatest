package org.id.modernjava.javaimprovements;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Java10TypeInterferenceExample {
    public static void main(String[] args) {
        //String
        String nn = "ll";
        //java 10
        var aa = "bb";
        System.out.println(aa);

        //DateTimee
        LocalDateTime localDateTime = LocalDateTime.now();
        var localDateTime1 = LocalDateTime.now();
        System.out.println("localDateTime1 = " + localDateTime1);

        Map<Integer, String> map = Map.of(1, "olfa", 2, "khalil", 3, "mm");
        var map1 = Map.of(1, "olfa", 2, "khalil", 3, "mm");
        System.out.println("map1 = " + map1);

        //integer array
        int[] ints = {1, 2, 3};
        var ints1 = new int[]{1, 2, 5};

        //list
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        System.out.println("list = " + list);

        var list1 = new ArrayList<>();
        list1.add("aa");
        list1.add(1);
        System.out.println("list1 = " + list1);
        //List of Integer
        var integers = List.of(1, 2, 3);
        integers.forEach(System.out::println);
        //int num=9999999999L;
        var num = 9999999999.99999;

        var rs = 9 / 2;//4
        System.out.println("rs = " + rs);


        //  int rs1 = 9.0 / 2; compilation error vu que
        //  required type is int and provided is double
        var rs1 = 9.0 / 2; //4.5
        rs1 = 11d / 2d;
        System.out.println("rs1 = " + rs1);
        var word = "MM";
        print(word);
    }

    public static void print(String var) {
        System.out.println("var = " + var);
    }
}
