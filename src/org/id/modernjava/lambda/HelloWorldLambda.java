package org.id.modernjava.lambda;

public class HelloWorldLambda {


    public static void main (String[] args) {
        HelloWorldInterface helloWorldInterface = () -> "hello from lambda";
        System.out.println(helloWorldInterface.sayHello());

    }
}
