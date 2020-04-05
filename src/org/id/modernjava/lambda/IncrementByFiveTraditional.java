package org.id.modernjava.lambda;

public class IncrementByFiveTraditional implements IncrementByFive {
    @Override
    public int incrementByFive (int x) {
        return x + 5;
    }

    public static void main (String[] args) {
        IncrementByFiveTraditional incrementByFiveTraditional = new IncrementByFiveTraditional();
        System.out.println(incrementByFiveTraditional.incrementByFive(5));
    }
}
