package lr4;

import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = readArraySize(scanner);
        byte[] array = readByteArray(scanner, size);
        printArraySum(array);
        scanner.close();
    }

    private static int readArraySize(Scanner scanner) {
        int size;
        do {
            System.out.print("Введите размер массива: ");
            size = getIntInput(scanner);
        } while (size <= 0);
        return size;
    }

    private static int getIntInput(Scanner scanner) {
        int num = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                num = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
            }
        }
        return num;
    }

    private static byte[] readByteArray(Scanner scanner, int size) {
        byte[] array = new byte[size];
        for (int i = 0; i < size; i++) {
            array[i] = getByteInput(scanner);
        }
        return array;
    }

    private static byte getByteInput(Scanner scanner) {
        byte num = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                num = Byte.parseByte(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число типа byte.");
            }
        }
        return num;
    }

    private static void printArraySum(byte[] array) {
        try {
            byte sum = calculateSum(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива.");
        }
    }

    private static byte calculateSum(byte[] array) {
        byte sum = 0;
        for (byte num : array) {
            sum += num;
        }
        return sum;
    }
}
