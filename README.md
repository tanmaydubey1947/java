Java 16 introduced below features:

1. Records Final:
   - Records provide a compact syntax for declaring classes that are transparent holders for shallowly immutable data.
   - Behind the scenes, the compiler automatically generates boilerplate code such as constructors, accessors, equals(), hashCode(), and toString() methods.
   - Records are introduced for carrying data with less code. That's why they don't have setters.

Example:
```java
public record User(String name, int age) {
    // No need to write constructors, getters, equals, hashCode, or toString
}
```

2. Pattern Matching for instanceof:
   - This feature allows you to test if an object is an instance of a specific type and, if so, cast it to that type in a single step.
   - It simplifies code by eliminating the need for explicit casting after an instanceof check.
Example:
```java
Object obj = "Hello, World!";
if (obj instanceof String str) {
    System.out.println(str.toUpperCase()); // No need for explicit casting
}
```
   