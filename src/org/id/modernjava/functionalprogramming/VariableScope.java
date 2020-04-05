package org.id.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.IntConsumer;

public class VariableScope {
    static int k = 8;

    public static void main (String[] args) {
        int a = 10; //local var
        //le paramétre du block lambda ci dessous ne doit pas avoir le mm nom que local var(a)
        // IntConsumer intConsumer = (a) -> System.out.println(a * 10);
        IntConsumer intConsumer = (b) -> System.out.println(b * 10 + a); //on peut utiliser local var(a)

        //De le block lambda ci dessous on ne peut pas modifier local var(a) tant qu'elle est final implicitement
        // IntConsumer intConsumer = (i) -> System.out.println(a++);

        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(instructor -> {
            // a++; compliper error
            System.out.println(k++);
            System.out.println(instructor);
        });
    }
}
