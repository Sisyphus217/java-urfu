package lr4;

import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        if (matrix != null) {
            int columnNum = readColumnNumber(scanner, matrix[0].length);
            printColumn(matrix, columnNum);
        }
        scanner.close();
    }

    private static int[][] readMatrix(Scanner scanner) {
        int rows = readDimension(scanner, "строк");
        int cols = readDimension(scanner, "столбцов");

        if (rows <= 0 || cols <= 0) {
            System.out.println("Ошибка: некорректные размеры матрицы.");
            return null;
        }

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = readIntInput(scanner);
            }
        }
        return matrix;
    }

    private static int readDimension(Scanner scanner, String dimension) {
        int size;
        do {
            System.out.print("Введите количество " + dimension + " матрицы: ");
            size = readIntInput(scanner);
            if (size <= 0) {
                System.out.println("Ошибка: количество " + dimension + " должно быть положительным числом.");
            }
        } while (size <= 0);
        return size;
    }

    private static int readIntInput(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
            }
        }
    }

    private static int readColumnNumber(Scanner scanner, int maxCols) {
        int columnNum;
        do {
            System.out.print("Введите номер столбца для вывода (от 0 до " + (maxCols - 1) + "): ");
            columnNum = readIntInput(scanner);
            if (columnNum < 0 || columnNum >= maxCols) {
                System.out.println("Ошибка: введен некорректный номер столбца.");
            }
        } while (columnNum < 0 || columnNum >= maxCols);
        return columnNum;
    }

    private static void printColumn(int[][] matrix, int columnNum) {
        System.out.println("Столбец " + columnNum + " матрицы:");
        for (int[] row : matrix) {
            if (columnNum < row.length) {
                System.out.println(row[columnNum]);
            } else {
                System.out.println("Недостаточно элементов в строке для данного столбца.");
            }
        }
    }
}
