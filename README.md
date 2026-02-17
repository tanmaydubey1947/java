Java 17 introduced below features:

1. Sealed Classes (Final)
   - Allow developers to restrict which other classes or interfaces may extend or implement them.
   - Subclasses must be: final, sealed, or non-sealed.
   - Sealed classes work with interfaces and abstract classes as well.
   - A non-sealed class is a normal class in every sense, but it must be explicitly marked non-sealed to be allowed to extend a sealed class and reopen inheritance.

Example:

```java
   public sealed class Shape permits Circle, Square {
   // class body
   }

public final class Circle extends Shape {
// class body
}

public final class Square extends Shape {
// class body
}
```

2. Pattern Matching enhancement for instanceof
   - Simplifies the common practice of checking if an object is an instance of a specific type and then casting it.
   - With pattern matching, you can declare a variable to hold the casted value directly in the instanceof expression.

Example:
```java
   Object obj = "Hello, World!";
   if (obj instanceof String str) {
       System.out.println(str.toUpperCase());
   }
```

3. Strong Encapsulation of JDK Internals
    - Java 17 strengthens the encapsulation of internal APIs, making it more difficult for developers to access non-public members of the JDK.
    - This is part of the ongoing effort to improve security and maintainability by preventing unintended access to internal APIs.

4. New GC updates (ZGC, Shenandoah – conceptual)
    - ZGC (Z Garbage Collector) and Shenandoah are low-latency garbage collectors designed to minimize pause times.
    - Java 17 includes improvements to these garbage collectors, enhancing their performance and efficiency.