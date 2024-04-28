package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "banana", "Orange", "grape", "Pineapple");

        List<String> capitalizedStrings = filterCapitalized(strings);

        System.out.println("Исходный список: " + strings);
        System.out.println("Отфильтрованные строки: " + capitalizedStrings);
    }

    private static List<String> filterCapitalized(List<String> strings) {
        return strings.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}

