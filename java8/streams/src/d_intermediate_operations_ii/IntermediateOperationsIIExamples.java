package d_intermediate_operations_ii;

import java.util.Arrays;
import java.util.List;


public class IntermediateOperationsIIExamples {

    public static void main(String[] args) {

        List<String> items = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
        items.stream().skip(4).peek(item -> System.out.println("Processing item: " + item));
    }
}
