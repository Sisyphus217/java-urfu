package timus.task_1545;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        List<String> hieroglyphs = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            hieroglyphs.add(scanner.nextLine());
        }

        String inputChar = scanner.nextLine();
        scanner.close();

        List<String> suggestions = new ArrayList<>();

        for (String hieroglyph : hieroglyphs) {
            if (hieroglyph.startsWith(inputChar)) {
                suggestions.add(hieroglyph);
            }
        }

        for (String suggestion : suggestions) {
            System.out.println(suggestion);
        }
    }
}
