# JAVA 11 Features

* HTTP Client API

Before JAVA 11, HttpURL was the primary way to make HTTP requests, which was cumbersome and lacked modern features. 
JAVA 11 introduced a new HTTP Client API that supports HTTP/2, WebSocket, and asynchronous programming.

Example:
```java
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("https://example.com"))
    .build();
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());
```

* String methods (isBlank, lines, repeat, strip)
Example:
```java
String str = "  Hello World  ";
System.out.println(str.isBlank()); // false
System.out.println(str.strip()); // "Hello World"
System.out.println(str.lines().count()); // 1
System.out.println("Hi! ".repeat(3)); // "Hi! Hi! Hi! "
```


* File methods (readString, writeString)
Before JAVA 11, reading and writing files required multiple lines of code. 
JAVA 11 introduced convenient methods to read and write strings directly to files.
Example:
```java
Path path = Paths.get("example.txt");
Files.writeString(path, "Hello, World!");

Path readPath = Paths.get("example.txt");
String content = Files.readString(readPath);
System.out.println(content); // "Hello, World!"
```


* Lambda parameter `var`
Till JAVA 10, lambda parameters had to be explicitly typed or inferred. From JAVA 11, you can use `var` in lambda parameters.
* Example:
```java
BiFunction<Integer, Integer, Integer> add = (var a, var b) -> a + b;
System.out.println(add.apply(5, 10)); // 15
```
NOTE: You cannot mix `var` and explicit types in the same parameter list. i.e., (var a, int b) is not allowed.

* Removal of Java EE & CORBA modules
Below modules were removed from the JDK in JAVA 11:
- java.xml.ws (JAX-WS)
- java.xml.bind (JAXB)
- java.activation (JAF)
- java.corba (CORBA)
- java.transaction (JTA)
- java.se.ee (Java EE APIs)

Corba Modules which were removed:
- java.corba
- java.rmi
- org.omg.*