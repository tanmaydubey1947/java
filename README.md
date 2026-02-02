Java 15 introduced below features:

1. Text Blocks (Final)
   - Multi-line string literals that improve readability of strings in code.
   - Example:
     ```java
     String json = """
                   {
                       "name": "John",
                       "age": 30
                   }
                   """;
     ```
     
2. Hidden Classes: These are not intended to be used directly by developers but provide advanced capabilities for frameworks and libraries.
    - Classes that are not discoverable by the class loader, useful for frameworks that generate classes at runtime.
    - Example:
      ```java
      // Example usage of hidden classes would typically involve advanced class loading techniques.
      ```

3. Sealed Classes (Preview)
   - Allow developers to restrict which other classes or interfaces may extend or implement them.
   - Subclasses must be: final, sealed, or non-sealed.
   - Sealed classes work with interfaces and abstract classes as well.
   - A non-sealed class is a normal class in every sense, but it must be explicitly marked non-sealed to be allowed to extend a sealed class and reopen inheritance.
   - Example:
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