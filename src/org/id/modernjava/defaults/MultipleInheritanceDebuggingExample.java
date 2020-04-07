package org.id.modernjava.defaults;

public class MultipleInheritanceDebuggingExample implements InterfaceA, InterfaceD {

    public void sumA(int num1, int num2) {
        System.out.println("InterfaceA.sumA " + (num1 + num2));

    }
}
