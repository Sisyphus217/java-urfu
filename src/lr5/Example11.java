package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example11 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "pineapple");
        int minLength = 6;

        List<String> filteredStrings = filterByLength(strings, minLength);

        System.out.println("Исходный список: " + strings);
        System.out.println("Отфильтрованные строки: " + filteredStrings);
    }

    private static List<String> filterByLength(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}
