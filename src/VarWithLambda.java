import java.util.Arrays;

public class VarWithLambda {

    public static void main(String[] args) {

        var numbers = new int[]{1, 2, 3, 4, 5};

        var squaredNumbers = Arrays.stream(numbers)
                .map(n -> {
                    var square = n * n;
                    return square;
                })
                .toArray();

        System.out.println("Original numbers: " + Arrays.toString(numbers));
        System.out.println("Squared numbers: " + Arrays.toString(squaredNumbers));
    }
}
