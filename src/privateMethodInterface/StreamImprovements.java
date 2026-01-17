package privateMethodInterface;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImprovements {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 1, 6);

        List<Integer> taken = numbers.stream()
                .takeWhile(n -> n < 4) // Here short-circuit will happen at number 4
                .collect(Collectors.toList()); // Result: [1, 2, 3]
        System.out.println(taken);

        List<Integer> dropped = numbers.stream()
                .dropWhile(n -> n < 5) // Here short-circuit will happen at number 6
                .collect(Collectors.toList()); // Result: [4, 5, 6]
        System.out.println(dropped);

        Stream.iterate(1, n -> n < 10, n -> n + 2)
                .forEach(System.out::println); // Prints odd numbers less than 10
    }
}
