package org.id.modernjava.javaimprovements;

import java.time.LocalDate;

public class Java13ImprovementSwitchStatementExample {
    public static void main(String[] args) {
        String month = "A";
        String quarter = switch (month) {
            case "A", "B", "C" -> {
                var isLeapYear = LocalDate.now().isLeapYear();
                yield (isLeapYear ? "is leap" : "not");
            }
            case "D" -> "D";
            default -> "NOOOO";


        };
        System.out.println("quarter = " + quarter);
    }
}
