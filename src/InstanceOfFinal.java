public class InstanceOfFinal {

    public static void main(String[] args) {

        final String str = "Hello";
        // str = "World"; // This will cause a compile-time error

        if (str instanceof String) {
            System.out.println("The variable 'str' is an instance of String.");
        } else {
            System.out.println("The variable 'str' is not an instance of String.");
        }
    }
}
