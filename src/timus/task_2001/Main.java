package timus.task_2001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt(); // � �������
        int b1 = scanner.nextInt(); // � �������

        int a2 = scanner.nextInt(); // ������
        int b2 = scanner.nextInt(); // ������

        int a3 = scanner.nextInt(); // ������
        int b3 = scanner.nextInt(); // ������

        int initialWeight2 = b1 - b2;
        int initialWeight1 = a1 - a3;

        System.out.println(initialWeight1 + " " + initialWeight2);
    }
}
