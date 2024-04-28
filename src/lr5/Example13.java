package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example13 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple123", "banana", "orange456", "grape", "pineapple!");

        List<String> filteredStrings = filterByLetters(strings);

        System.out.println("Исходный список: " + strings);
        System.out.println("Отфильтрованные строки: " + filteredStrings);
    }

    private static List<String> filterByLetters(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
