package lr5;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int minValue = 25;

        List<Integer> filteredNumbers = filterByMinValue(numbers, minValue);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа, большие " + minValue + ": " + filteredNumbers);
    }

    private static List<Integer> filterByMinValue(List<Integer> numbers, int minValue) {
        return numbers.stream()
                .filter(x -> x > minValue)
                .collect(Collectors.toList());
    }
}
