package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Year currentYear = Year.now();
        int year = currentYear.getValue();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя:");
        String name = scanner.nextLine().trim();

        System.out.print("Введите ваш год рождения:");
        int yearOfBorth = scanner.nextInt();

        int age = year - yearOfBorth;
        int approxAge = age - 1;

        System.out.printf("%s, %d - %d года", name, approxAge, age);

    }
}
