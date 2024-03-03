package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название дня недели:");
        String dayOfWeek = scanner.nextLine();

        System.out.print("Введите номер дня в месяце:");
        String date = scanner.nextLine();

        System.out.print("Введите название месяца:");
        String month = scanner.nextLine();

        System.out.printf("%s, %s, %s", dayOfWeek, date, month);
    }
}
