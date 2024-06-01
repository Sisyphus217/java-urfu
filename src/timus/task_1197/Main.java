package timus.task_1197;

import java.util.Scanner;

public class Main {
    private static boolean isValid(int x, int y) {
        return x >= 1 && x <= 8 && y >= 1 && y <= 8;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; ++i) {
            String position = scanner.nextLine();
            char file = position.charAt(0);
            int rank = Character.getNumericValue(position.charAt(1));

            int x = file - 'a' + 1;
            int y = rank;

            int count = 0;

            for (int j = 0; j < 8; ++j) {
                int newX = x + dx[j];
                int newY = y + dy[j];
                if (isValid(newX, newY)) {
                    count++;
                }
            }

            result.append(count).append(" ");
        }

        System.out.println(result.toString().trim());
        scanner.close();
    }
}


