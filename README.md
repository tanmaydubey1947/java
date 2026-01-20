Java 12 introduced switch expressions as a preview feature, making switch usable as an expression with better readability. On the JVM side, it added low-latency GC improvements like Shenandoah and enhanced G1 GC, along with startup and performance improvements such as default CDS archives.

* Switch Expressions: Switch can now be used as an expression, allowing for more concise code. 
The new syntax supports both traditional case labels and the new "arrow" syntax.

NOTE: This feature was a preview in Java 12 and became a standard feature in Java 14. So to run this code, ensure you are using Java 14 or later.
```java
int dayOfWeek = 3;
String dayName = switch (dayOfWeek) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    case 6 -> "Saturday";
    case 7 -> "Sunday";
    default -> throw new IllegalArgumentException("Invalid day: " + dayOfWeek);
};
```

* Low-Latency Garbage Collectors: Java 12 introduced Shenandoah, a low-pause-time garbage collector that aims to reduce GC pause times by performing more work concurrently with the application threads. G1 GC also received enhancements to improve its performance and reduce pause times.