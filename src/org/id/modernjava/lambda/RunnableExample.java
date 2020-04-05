package org.id.modernjava.lambda;

public class RunnableExample {
    public static void main (String[] args) {
        Runnable OldRunnable = new Runnable() {
            @Override
            public void run () {
                int sum = 0;
                for (int i = 1; i <= 10; i++)
                    sum += i;
                System.out.println("traditional " + sum);
            }
        };
        new Thread(OldRunnable).start();


        Runnable lambdaRunnable = () -> {
            int sum = 0;
            for (int i = 1; i <= 10; i++)
                sum += i;
            System.out.println("Runnable Lambda " + sum);
        };
        new Thread(lambdaRunnable).start();

        //Implementing using thread with Lambda


        new Thread(() -> {
            int sum = 0;
            for (int i = 1; i <= 10; i++)
                sum += i;
            System.out.println("Thread Lambda " + sum);
        }).start();
    }

}
