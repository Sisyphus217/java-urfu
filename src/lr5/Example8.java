package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = calculateSquares(numbers);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Квадраты чисел: " + squares);
    }

    private static List<Integer> calculateSquares(List<Integer> numbers) {
        return numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }
}
