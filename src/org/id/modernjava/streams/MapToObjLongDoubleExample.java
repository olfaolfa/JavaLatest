package org.id.modernjava.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.*;

public class MapToObjLongDoubleExample {
    public static void main (String[] args) {
        List<RandomIds> randomIds = IntStream.rangeClosed(0, 5).mapToObj((i) -> new RandomIds(i, ThreadLocalRandom.current().nextInt(15))).collect(Collectors.toList());
        randomIds.forEach(System.out::println);
        System.out.println("-------------------------");

        LongStream longStream = IntStream.rangeClosed(0, 5).mapToLong(n -> (long) n);
        longStream.forEach(System.out::println);

        System.out.println("-------------------------");

        DoubleStream doubleStream = LongStream.rangeClosed(0, 5).mapToDouble(n -> (double) n);
        doubleStream.forEach(System.out::println);


    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class RandomIds {
    int id;
    int randomNumbers;
}
