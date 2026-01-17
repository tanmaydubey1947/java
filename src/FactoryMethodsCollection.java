import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodsCollection {

    // Factory method for Collections (List.of, Set.of, Map.of)

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3);
        list.forEach(System.out::println);

        Set<Integer> set = Set.of(1, 2, 3);
        set.forEach(System.out::println);

        // Here we can create upto 10 key-value pairs
        Map<Integer, Integer> integerIntegerMap = Map.of(2, 1, 3, 4);
        integerIntegerMap.forEach((key, value) -> System.out.println(key + " : " + value));

        // For more than 10 key-value pairs, we can use Map.ofEntries
        Map<Integer, String> integerStringMap = Map.ofEntries(
                Map.entry(1, "one"),
                Map.entry(2, "two"),
                Map.entry(3, "three")
        );
        integerStringMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}