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
* Stream API enhancements (takeWhile, dropWhile, iterate)
* Optional improvements
* Private methods in interfaces
* JShell