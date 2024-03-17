package lr2;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    array[i][j] = 1;
                }
                continue;
            }
            Arrays.fill(array[i], 0);
        }
        for (int[] row : array) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
