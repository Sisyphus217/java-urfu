package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int maxValue = 35;

        List<Integer> filteredNumbers = filterByMaxValue(numbers, maxValue);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа, меньшие " + maxValue + ": " + filteredNumbers);
    }

    private static List<Integer> filterByMaxValue(List<Integer> numbers, int maxValue) {
        return numbers.stream()
                .filter(x -> x < maxValue)
                .collect(Collectors.toList());
    }
}
