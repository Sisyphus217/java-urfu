package timus.task_1110;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.close();

        List<Integer> results = new ArrayList<>();

        for (int X = 0; X < M; X++) {
            if (modularExponentiation(X, N, M) == Y) {
                results.add(X);
            }
        }

        if (results.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int result : results) {
                System.out.print(result + " ");
            }
        }
    }

    private static int modularExponentiation(int base, int exponent, int mod) {
        long result = 1;
        long baseMod = base % mod;

        while (exponent > 0) {
            if ((exponent % 2) == 1) {
                result = (result * baseMod) % mod;
            }
            baseMod = (baseMod * baseMod) % mod;
            exponent /= 2;
        }

        return (int) result;
    }
}
