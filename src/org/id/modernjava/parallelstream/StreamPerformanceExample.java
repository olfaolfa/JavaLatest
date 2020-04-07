package org.id.modernjava.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StreamPerformanceExample {
    public static void main(String[] args) {
        int loop = 20;
        long result = measurePerformance(StreamPerformanceExample::sumSequentialStream, loop);
        System.out.println("Time taken to process sum in " + "sequential" + " " + result + " in msec");
        result = measurePerformance(StreamPerformanceExample::sumParallelStream, loop);
        System.out.println("Time taken to process sum in parallel  " + result + " in msec");

    }

    public static Long measurePerformance(Supplier<Integer> supplier, int numberOfTimes) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++)
            supplier.get();
        long end = System.currentTimeMillis();
        return end - start;

    }

    public static int sumSequentialStream() {
        return IntStream.rangeClosed(1, 1000).sum();
    }

    public static int sumParallelStream() {
        return IntStream.rangeClosed(1, 1000).parallel().sum();
    }
}
