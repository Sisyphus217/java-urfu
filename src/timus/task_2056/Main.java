package timus.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] grades = new int[n];
        boolean hasThree = false;
        boolean allFives = true;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextInt();
            if (grades[i] == 3) {
                hasThree = true;
            }
            if (grades[i] != 5) {
                allFives = false;
            }
            sum += grades[i];
        }

        if (hasThree) {
            System.out.println("None");
        } else if (allFives) {
            System.out.println("Named");
        } else {
            double average = (double) sum / n;
            if (average >= 4.5) {
                System.out.println("High");
            } else {
                System.out.println("Common");
            }
        }
    }
}
