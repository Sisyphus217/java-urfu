package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        int first = num - 1;
        int third = num + 1;
        int fourth = (int) Math.pow(num+first+third, 2);
        System.out.printf("%d, %d, %d, %d", first, num, third, fourth);
    }
}
