package a_core_concepts;

import java.util.Arrays;
import java.util.List;

public class CoreConceptExamples {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        long count = names.stream()
                .filter(n -> n.length() > 3)
                .count();

        System.out.println(count);
    }
}
