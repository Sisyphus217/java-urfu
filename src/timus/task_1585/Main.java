package timus.task_1585;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> penguinCount = new HashMap<>();
        penguinCount.put("Emperor Penguin", 0);
        penguinCount.put("Little Penguin", 0);
        penguinCount.put("Macaroni Penguin", 0);

        for (int i = 0; i < n; i++) {
            String penguinType = scanner.nextLine();
            penguinCount.put(penguinType, penguinCount.get(penguinType) + 1);
        }

        String mostPopularPenguin = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : penguinCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostPopularPenguin = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println(mostPopularPenguin);
    }
}
