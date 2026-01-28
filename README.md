Java 14 introduced below features:

1. Switch Expression (Final)
- Switch expressions allow you to use the switch statement as an expression, returning a value.
- Example:
```java
  String day = "MONDAY";
  String typeOfDay = switch (day) {
        case "SATURDAY", "SUNDAY" -> "Weekend";
        default -> "Weekday";
  };
  ```

2. Records (Preview)
- Records provide a compact syntax for declaring classes that are transparent holders for shallowly immutable data.
- Behind the scenes, the compiler automatically generates boilerplate code such as constructors, accessors, equals(), hashCode(), and toString() methods.
- Records are introduced for carrying data with less code. That's why they don't have setters.
- Example:
```java
  public record Point(int x, int y) {}
  ```

3. Pattern Matching for instanceof (Preview)
- This feature simplifies the common practice of casting an object after checking its type with instanceof.
- Example Before:
```java
  if (obj instanceof String) {
        String s = (String) obj;
        System.out.println(s.toLowerCase());
  }
  ```
- Example After:
```java
  if (obj instanceof String s) {
        System.out.println(s.toLowerCase());
  }
  ```