package lr2;

import java.util.ArrayList;
import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        Random random = new Random();

        int arraySize = random.nextInt(10) + 1;

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Случайный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int min = Integer.MAX_VALUE;
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < arraySize; i++) {
            if (array[i] < min) {
                min = array[i];
                indexes.clear();
                indexes.add(i);
            } else if (array[i] == min) {
                indexes.add(i);
            }
        }
        System.out.printf("\nМинимальное число: %s, под индексом: %s", min, indexes);
    }
}
