package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1-ое число:");
        int firstNum = scanner.nextInt();

        System.out.print("Введите 2-ое число:");
        int secNum = scanner.nextInt();

        int sum = firstNum + secNum;
        int diff = firstNum - secNum;

        System.out.printf("Сумма: %d, разность: %d", sum, diff);
    }
}
