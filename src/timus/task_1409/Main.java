package timus.task_1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int total = a + b -1;
        int resA = total - a;
        int resB = total - b;

        System.out.println(resA + " " + resB);
    }
}
