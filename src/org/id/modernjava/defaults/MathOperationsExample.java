package org.id.modernjava.defaults;

public class MathOperationsExample implements Calculator {

    public static void main(String[] args) {
        MathOperationsExample mathOperationsExample = new MathOperationsExample();
        Calculator calculator = Integer::sum;
        System.out.println("Calculator override using lambda " + calculator.sum(3, 2));
        System.out.println("Subtract: " + mathOperationsExample.subtract(4, 2));
        System.out.println("Multiply: " + Calculator.multiply(1, 2));

    }


    @Override
    public int sum(int a, int b) {
        return a + b;
    }

}
