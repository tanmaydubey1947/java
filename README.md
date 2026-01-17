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

* Stream API enhancements (takeWhile, dropWhile, iterate)
* Optional improvements
* JShell