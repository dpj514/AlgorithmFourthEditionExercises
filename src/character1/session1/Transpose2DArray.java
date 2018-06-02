package character1.session1;

import java.util.Arrays;

//1.1.13
public class Transpose2DArray {
    private static int[][] transpose2DArray(int[][] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    break;  // break跳出单层循环
                }
                temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        return array;
    }

    private static void showMatrix(int[][] array) {
        for (int[] itemArray :
                array) {
            System.out.println(Arrays.toString(itemArray));
        }

    }

    public static void main(String args[]) {
        int[][] test2DArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        showMatrix(test2DArray);
        System.out.println("---------");
        showMatrix(transpose2DArray(test2DArray));
    }
}
