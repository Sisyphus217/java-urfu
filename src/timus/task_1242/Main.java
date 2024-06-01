package timus.task_1242;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        long totalLines = (long) N * (M + 1);

        System.out.println(totalLines);
    }
}
