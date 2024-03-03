package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Year currentYear = Year.now();
        int year = currentYear.getValue();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст:");
        int age = scanner.nextInt();

        int borthYear = year - age;
        int approxBorthYear = borthYear - 1;

        System.out.printf("Вы родились в %d либо %d году", approxBorthYear, borthYear);
    }
}
