package org.id.modernjava.lambda;

public class ConcatenateLambda {
    public static void main (String[] args) {
        ConcatenateInterface concatenateInterface = (x, y) -> x +" "+ y;
        System.out.println(concatenateInterface.sconcat("Hello","World"));
    }

}
