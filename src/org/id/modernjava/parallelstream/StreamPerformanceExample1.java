package org.id.modernjava.parallelstream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPerformanceExample1 {
    static int tokenCount = 25;

    public static void main(String[] args) {
        int loop = 20;
        long result = measurePerformance(StreamPerformanceExample1::sortSequentialStream, loop);
        System.out.println("Time taken to process sort in" + " " + "sequential" + " " + result + " in msec");
        result = measurePerformance(StreamPerformanceExample1::sortParallelStream, loop);
        System.out.println("Time taken to process sort in" + " parallel  " + result + " in msec");

    }

    public static Long measurePerformance(Supplier<Integer> supplier, int numberOfTimes) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++)
            supplier.get();
        long end = System.currentTimeMillis();
        return end - start;

    }

    public static int sortSequentialStream() {
        List<RandomToken> randomTokens = IntStream.rangeClosed(1, tokenCount).mapToObj(i -> new RandomToken(i, ThreadLocalRandom.current().nextLong(tokenCount))).collect(Collectors.toList());

        randomTokens.stream().sorted(Comparator.comparing(RandomToken::getTokens));
        return -1;
    }

    public static int sortParallelStream() {
        List<RandomToken> randomTokens = IntStream.rangeClosed(1, tokenCount).parallel().mapToObj(i -> {
            return new RandomToken(i, ThreadLocalRandom.current().nextLong(tokenCount));
        }).collect(Collectors.toList());

        randomTokens.stream().parallel().sorted(Comparator.comparing(RandomToken::getTokens));
        return -1;

    }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class RandomToken {
    int id;
    long tokens;
}
