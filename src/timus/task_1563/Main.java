package timus.task_1563;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> visitedShops = new HashSet<>();
        int bayanCount = 0;

        for (int i = 0; i < n; i++) {
            String shopName = scanner.nextLine().toLowerCase();
            if (visitedShops.contains(shopName)) {
                bayanCount++;
            } else {
                visitedShops.add(shopName);
            }
        }

        System.out.println(bayanCount);
    }
}
