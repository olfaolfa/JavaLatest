package org.id.modernjava.java9improvements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TryWithResourcesExample {

    public static void main(String[] args) throws IOException {
        //java 8
        Reader reader = new StringReader("i'am learning " + "java8");
        BufferedReader bufferedReader = new BufferedReader(reader);
        try (BufferedReader bufferedReader1 = bufferedReader) {
            System.out.println(bufferedReader1.readLine());
        }

        //java 9
        Reader reader1 = new StringReader("i'am learning " + "java9");
        BufferedReader bufferedReader1 =
                new BufferedReader(reader1);
        try (bufferedReader1) {
            System.out.println(bufferedReader1.readLine());
        }
    }
}
