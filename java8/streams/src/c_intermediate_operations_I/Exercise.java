package c_intermediate_operations_I;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise {

    public static void main(String[] args) {

        System.out.println("****Upper Case******");
        String[] strArr = new String[]{"abc", "def", "ghi"};
        Stream<String> stringStream =Arrays.stream(strArr);
        List<String> strList = stringStream.map(a -> a.toUpperCase()).collect(Collectors.toList());
        strList.forEach(a -> System.out.println(a));

        System.out.println("****Sorted List******");
        List<Integer> unsorted = Arrays.asList(423,1234,12,43,4423,423,4,234131);
        Collections.sort(unsorted, (a, b) -> (a < b) ? 1 : ((a > b) ? -1 : 0));
        unsorted.forEach(a -> System.out.println(a));

        System.out.println("****Remove Duplicates******");
        List<String> duplicateList = Arrays.asList("a", "a", "bc", "bc", "d", "e");
        List<String> distinct = duplicateList.stream().distinct().collect(Collectors.toList());
        distinct.forEach(a -> System.out.println(a));

    }
}
