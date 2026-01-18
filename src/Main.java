import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        varExamples();
        unmodifiableCollections();
    }

    private static void varExamples() {
        var number = 10; // 'number' is inferred as int
        var text = "Hello, World!"; // 'text' is inferred as String
        var list = new ArrayList<String>(); // 'list' is inferred as ArrayList<String>
        var stream = list.stream(); // 'stream' is inferred as Stream<String>
        var map = Map.of("key1", 1, "key2", 2); // 'map' is inferred as Map<String, Integer>
        var result = number + 20; // 'result' is inferred as int
        var isActive = true; // 'isActive' is inferred as boolean
        var pi = 3.14; // 'pi' is inferred as double
        var optional = Optional.of("value"); // 'optional' is inferred as Optional<String>
        var array = new int[] {1, 2, 3}; // 'array' is inferred as int[]
    }

    private static void unmodifiableCollections() {
        List<String> modifiableList = new ArrayList<>();
        modifiableList.add("A");
        modifiableList.add("B");

        // Create an unmodifiable copy of the list
        List<String> unmodifiableList = List.copyOf(modifiableList);

        System.out.println("Modifiable List: " + modifiableList);
        System.out.println("Unmodifiable List: " + unmodifiableList);

        try {
            unmodifiableList.add("C"); // This will throw UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify unmodifiableList: " + e.getMessage());
        }
    }

}