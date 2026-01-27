Java 13 introduced below features:

1. Text Blocks (Preview): Multi-line string literals that simplify the creation of strings that span multiple lines.
Note that Text Blocks were finalized in Java 15. In Java 13 it came as a preview feature.
2. Switch Expressions (Preview): Enhancements to the switch statement that allow it to be used as an expression and return a value.


ExampleText Blocks:
```java
public class TextBlockExample {
    public static void main(String[] args) {
        String json = """
                      {
                          "name": "John",
                          "age": 30,
                          "city": "New York"
                      }
                      """;
        System.out.println(json);
    }
}
```

Example Switch Expressions:
```java
public class SwitchExpressionExample {
    public static void main(String[] args) {
        int day = 3;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(dayName);
    }
}
```