package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя:");
        String name = scanner.nextLine().trim();

        System.out.print("Введите возраст:");
        int age = scanner.nextInt();

        System.out.printf("Имя: %s, Возраст: %d", name, age);
    }
}
