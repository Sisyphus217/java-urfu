package lr3;
import java.util.Scanner;

public class Example8 {
    static void inputArray(int[] arr, int index, Scanner scanner) {
        if (index < arr.length) {
            System.out.print("Введите элемент массива arr[" + index + "]: ");
            arr[index] = scanner.nextInt();
            inputArray(arr, index + 1, scanner);
        }
    }

    static void outputArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.print(arr[index] + " ");
            outputArray(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        inputArray(array, 0, scanner);

        System.out.print("Элементы массива: ");
        outputArray(array, 0);

        scanner.close();
    }
}
