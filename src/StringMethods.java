public class StringMethods {

    public static void main(String[] args) {
        isBlankExample();
        repeatExample();
        stripExample();
        linesExample();
    }

    private static void isBlankExample() {
        String str1 = "   ";
        String str2 = "Hello";

        System.out.println("Is str1 blank? " + str1.isBlank()); // true
        System.out.println("Is str2 blank? " + str2.isBlank()); // false
    }

    private static void repeatExample() {
        String str = "Hi! ";
        String repeatedStr = str.repeat(3);
        System.out.println(repeatedStr); // Hi! Hi! Hi!
    }

    private static void stripExample() {
        String str = "\t  Hello World!  \n";
        String strippedStr = str.strip();
        System.out.println("Original: '" + str + "'");
        System.out.println("Stripped: '" + strippedStr + "'");
    }

    private static void linesExample() {
        String multiLineStr = "Hello World!\nWelcome to Java.\nEnjoy coding!";
        multiLineStr.lines().forEach(System.out::println);
    }
}
