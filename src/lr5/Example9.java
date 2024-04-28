package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "pineapple");

        List<String> filteredStrings = filterBySubstring(strings, "apple");

        System.out.println("Исходный список: " + strings);
        System.out.println("Отфильтрованные строки: " + filteredStrings);
    }

    private static List<String> filterBySubstring(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
