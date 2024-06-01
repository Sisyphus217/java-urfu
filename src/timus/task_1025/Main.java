package timus.task_1025;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int[] groupSizes = new int[K];

        for (int i = 0; i < K; i++) {
            groupSizes[i] = scanner.nextInt();
        }

        int result = findMinimumSupporters(K, groupSizes);
        System.out.println(result);
    }

    public static int findMinimumSupporters(int K, int[] groupSizes) {
        int majorityGroups = (K / 2) + 1;

        int[] minSupportersPerGroup = new int[K];

        for (int i = 0; i < K; i++) {
            minSupportersPerGroup[i] = (groupSizes[i] / 2) + 1;
        }

        Arrays.sort(minSupportersPerGroup);

        int totalSupporters = 0;
        for (int i = 0; i < majorityGroups; i++) {
            totalSupporters += minSupportersPerGroup[i];
        }

        return totalSupporters;
    }
}
