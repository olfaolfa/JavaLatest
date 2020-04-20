package org.id.modernjava.javaimprovements;

public class Java12ImprovementSwitchStatementExample1 {
    public static void main(String[] args) {
        String month = "JANUARY";
        String quarter = switch (month) {
            case "JA", "F", "A" -> " FIRST";
            case "MA", "JUI", "JU" -> "SONC";
            default -> "UNKNOWN";
        };
        System.out.println("quarter = " + month);

    }
}
