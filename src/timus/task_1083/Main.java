package timus.task_1083;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = parts[1].length();

        int result = computeMultiFactorial(n, k);
        System.out.println(result);
    }

    public static int computeMultiFactorial(int n, int k) {
        int result = 1;

        while (n > 0) {
            result *= n;
            n -= k;
        }

        return result;
    }
}
