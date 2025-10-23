package c_intermediate_operations_I;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationsIExamples {

    public static void main(String[] args) {

        List<String> result = Stream.of("cat", "dog", "dog", "bird")
                .filter(s -> s.length() == 3)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
