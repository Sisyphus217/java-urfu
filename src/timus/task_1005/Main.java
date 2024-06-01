package timus.task_1005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        int totalWeight = 0;
        for (int weight : weights) {
            totalWeight += weight;
        }

        int halfWeight = totalWeight / 2;

        boolean[] dp = new boolean[halfWeight + 1];
        dp[0] = true;

        for (int weight : weights) {
            for (int j = halfWeight; j >= weight; j--) {
                dp[j] |= dp[j - weight];
            }
        }

        int maxPossibleWeight = 0;
        for (int i = 0; i <= halfWeight; i++) {
            if (dp[i]) {
                maxPossibleWeight = i;
            }
        }

        int minDifference = totalWeight - 2 * maxPossibleWeight;

        System.out.println(minDifference);
    }
}
