package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int divisor = 10;

        List<Integer> divisibleNumbers = filterByDivisor(numbers, divisor);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа, делящиеся на " + divisor + " без остатка: " + divisibleNumbers);
    }

    private static List<Integer> filterByDivisor(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(x -> x % divisor == 0)
                .collect(Collectors.toList());
    }
}
