package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первое число:");
        int firstNum = scanner.nextInt();

        System.out.print("Второе число:");
        int secNum = scanner.nextInt();

        int sum = firstNum + secNum;

        System.out.print("Сумма: " + sum);
    }
}
