package a_core_concepts;

import java.util.Arrays;
import java.util.List;

public class Exercise {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Jack");

        //Question 1
        names.stream().filter(a -> a.startsWith("A")).forEach(a -> System.out.print(a));

        //Question 2
        long count = names.stream().filter(a -> a.length() % 2 == 0).count();
        System.out.println("\n" + count);

    }
}
