package lr3;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число для перевода в двоичную систему: ");
        try {
            int decimalNumber = scanner.nextInt();
            if (decimalNumber < 0) {
                System.out.println("Ошибка: Введено отрицательное число");
                return;
            }
            System.out.print("Двоичное представление числа " + decimalNumber + ": ");
            decimalToBinary(decimalNumber);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    static void decimalToBinary(int n) {
        if (n > 1)
            decimalToBinary(n / 2);
        System.out.print(n % 2);
    }
}
