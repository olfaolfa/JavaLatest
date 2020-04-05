package org.id.modernjava.lambda;

public class HelloWorldTraditional implements HelloWorldInterface {
    @Override
    public String sayHello () {
        return "hello from old way";
    }

    public static void main (String[] args) {
        HelloWorldTraditional helloWorldOldWay = new HelloWorldTraditional();
        System.out.println(helloWorldOldWay.sayHello());

    }
}
