# JAVA 9 Features


* Java Platform Module System (JPMS)
* Module descriptors (module-info.java)

Above two features are related to modular programming in Java 9. They allow developers to create modules, 
define dependencies, and encapsulate packages. To use it, create a module-info.java file in your project root and 
specify the module name and its dependencies. For example:
```java
module com.example.myapp {
    requires java.base;
    exports com.example.myapp;
}
```

Here we define a module named `com.example.myapp` that requires the `java.base` module and exports the `com.example.myapp` package.

* Factory methods for Collections (List.of, Set.of, Map.of)
Java 9 introduced convenient factory methods to create immutable collections. For example:
```java
List<String> list = List.of("A", "B", "C"); // Here we create an immutable list
Set<Integer> set = Set.of(1, 2, 3); // Here we create an immutable set
Map<String, Integer> map = Map.of("One", 1, "Two", 2); // Here we create an immutable map
```

* Private methods in interfaces
From Java 9 onwards, interfaces can have private methods to share common code between default methods. For example:
```java
public interface MyInterface {
    default void defaultMethod() {
        commonMethod();
    }

    private void commonMethod() {
        System.out.println("This is a private method in the interface.");
    }
}
```

* JShell
To start JShell, simply run the command `jshell` in your terminal. You can then type Java code directly into the shell and see immediate results. For example:
```
jshell> int x = 10;
jshell> int y = 20;
jshell> int sum = x + y;
jshell> System.out.println("Sum: " + sum);
Sum: 30
```

* Stream API enhancements (takeWhile, dropWhile, iterate)
Java 9 introduced new methods to the Stream API for better control over stream processing. For example:
```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
List<Integer> taken = numbers.stream()
                             .takeWhile(n -> n < 4)
                             .collect(Collectors.toList()); // Result: [1, 2, 3]
List<Integer> dropped = numbers.stream()
                              .dropWhile(n -> n < 4)
                              .collect(Collectors.toList()); // Result: [4, 5, 6]
                              
Stream.iterate(1, n -> n < 10, n -> n + 2)
        .forEach(System.out::println); // Prints odd numbers less than 10
```
    
                              
* Optional improvements
Java 9 added new methods to the Optional class for better handling of optional values which include ifPresentOrElse and or.
* For example:
```java
Optional<String> optional = Optional.of("Hello");
optional.ifPresentOrElse(
    value -> System.out.println("Value is present: " + value),
    () -> System.out.println("Value is absent")
);

Optional<String> emptyOptional = Optional.empty();
String value = emptyOptional.or(() -> Optional.of("Default Value")).get();
System.out.println("Value: " + value);
```