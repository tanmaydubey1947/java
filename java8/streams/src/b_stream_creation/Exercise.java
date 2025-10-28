package b_stream_creation;

import java.util.Random;
import java.util.stream.Stream;

public class Exercise {

    public static void main(String[] args) {

        Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2).limit(10);
        evenNumbers.forEach(n -> System.out.println(n));


        Stream<Integer> random = Stream.generate(() -> new Random(3).nextInt()).limit(5);
        random.forEach(n -> System.out.println(n));

    }
}
