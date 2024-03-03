package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите фамилию:");
        String secondName = scanner.nextLine().trim();

        System.out.print("Введите имя:");
        String name = scanner.nextLine().trim();

        System.out.print("Введите отчество:");
        String fathersName = scanner.nextLine().trim();

        System.out.printf("Hello %s, %s, %s", secondName, name, fathersName);
    }
}
