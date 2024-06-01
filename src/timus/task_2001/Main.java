package timus.task_2001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt(); // с урожаем
        int b1 = scanner.nextInt(); // с урожаем

        int a2 = scanner.nextInt(); // полная
        int b2 = scanner.nextInt(); // пустая

        int a3 = scanner.nextInt(); // пустая
        int b3 = scanner.nextInt(); // полная

        int initialWeight2 = b1 - b2;
        int initialWeight1 = a1 - a3;

        System.out.println(initialWeight1 + " " + initialWeight2);
    }
}
