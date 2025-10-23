package b_stream_creation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationExamples {

    public static void main(String[] args) {
        
        // Example 1: Creating a stream from a collection
        List<String> list = Arrays.asList("A", "B", "C");
        Stream<String> streamFromList = list.stream();
        streamFromList.forEach(System.out::println);

        // Example 2: Creating a stream from an array
        String[] array = {"X", "Y", "Z"};
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);

        // Example 3: Creating a stream using Stream.of(), Stream.iterate(), and Stream.generate()
        Stream<Integer> streamOf = Stream.of(1, 2, 3, 4, 5);
        streamOf.forEach(System.out::println);

        Stream<Integer> streamIterate = Stream.iterate(1, n -> n + 1).limit(5);
        streamIterate.forEach(System.out::println);

        Stream<Double> streamGenerate = Stream.generate(Math::random).limit(5);
        streamGenerate.forEach(System.out::println);

        // Example 4: Primitive streams
        IntStream intStream = IntStream.range(1, 6);
        intStream.forEach(System.out::println);
    }
}
