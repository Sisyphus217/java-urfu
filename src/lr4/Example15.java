package lr4;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = readArraySize(scanner);
        int[] array = readArrayElements(scanner, arraySize);
        printAverageOfPositiveElements(array);
        scanner.close();
    }

    public static int readArraySize(Scanner scanner) {
        int size;
        do {
            System.out.print("Введите размер массива: ");
            try {
                size = Integer.parseInt(scanner.nextLine());
                if (size <= 0) {
                    throw new IllegalArgumentException("Размер массива должен быть положительным числом.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
                size = 0;
            }
        } while (size <= 0);
        return size;
    }

    public static int[] readArrayElements(Scanner scanner, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива #" + (i + 1) + ": ");
            try {
                array[i] = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
                i--;
            }
        }
        return array;
    }

    public static void printAverageOfPositiveElements(int[] array) {
        int sum = 0;
        int positiveCount = 0;

        for (int value : array) {
            if (value > 0) {
                sum += value;
                positiveCount++;
            }
        }

        if (positiveCount == 0) {
            System.out.println("В массиве отсутствуют положительные числа.");
        } else {
            double averagePositive = (double) sum / positiveCount;
            System.out.println("Среднее арифметическое положительных чисел: " + averagePositive);
        }
    }
}
