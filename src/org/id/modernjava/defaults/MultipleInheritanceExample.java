package org.id.modernjava.defaults;

public class MultipleInheritanceExample implements InterfaceA, InterfaceB, InterfaceC {
    public static void main(String[] args) {
        MultipleInheritanceExample multipleInheritanceExample = new MultipleInheritanceExample();
        multipleInheritanceExample.sumA(1, 2);//resolve to child
        multipleInheritanceExample.sumB(1, 2);
        multipleInheritanceExample.sumC(1, 2);


    }

    // multipleInheritanceExample.sumA(1, 2) =>
    // MultipleInheritanceExample" + ".sumA" class more
    // power than interface

    // implemented class first
    // the sub interface that extends the interface
    public void sumA(int num1, int num2) {
        System.out.println("MultipleInheritanceExample.sumA" + (num1 + num2));
    }
}
