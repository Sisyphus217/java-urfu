package timus.task_1209;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; ++i) {
            int m = scanner.nextInt();
            double sqrtValue = Math.sqrt(8.0 * m - 7);

            if (sqrtValue == (int) sqrtValue) {
                result.append("1 ");
            } else {
                result.append("0 ");
            }
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        System.out.println(result.toString());

        scanner.close();
    }
}




