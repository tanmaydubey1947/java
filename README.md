* Local Variable Type Inference (var)

 ```java
var number = 10; // 'number' is inferred as int
var text = "Hello, World!"; // 'text' is inferred as String
var list = new ArrayList<String>(); // 'list' is inferred as ArrayList<String>
var map = Map.of("key1", 1, "key2", 2); // 'map' is inferred as Map<String, Integer>
var stream = list.stream(); // 'stream' is inferred as Stream<String>
var result = number + 20; // 'result' is inferred as int
var isActive = true; // 'isActive' is inferred as boolean
var pi = 3.14; // 'pi' is inferred as double
var optional = Optional.of("value"); // 'optional' is inferred as Optional<String>
var array = new int[] {1, 2, 3}; // 'array' is inferred as int[]

NOTE: The 'var' keyword can only be used for local variables inside methods, constructors, or initializer blocks.
      It cannot be used for class fields, method parameters, variables without initialization i.e. var x = null;
      or return types.
```

* Unmodifiable Collections Enhancements

Java 9 introduced factory methods to create unmodifiable collections using `List.of()`, `Set.of()`, and `Map.of()`. 
Java 10 introduced an enhancement to create a copy of an existing collection as unmodifiable using the `copyOf()` method.

```java
import java.util.ArrayList;
import java.util.List;

public class UnmodifiableCollectionsExample {
    public static void main(String[] args) {
        List<String> modifiableList = new ArrayList<>();
        modifiableList.add("A");
        modifiableList.add("B");

        // Create an unmodifiable copy of the list
        List<String> unmodifiableList = List.copyOf(modifiableList);

        System.out.println("Modifiable List: " + modifiableList);
        System.out.println("Unmodifiable List: " + unmodifiableList);

        // The below line will throw an UnsupportedOperationException
        // unmodifiableList.add("C");
    }
}