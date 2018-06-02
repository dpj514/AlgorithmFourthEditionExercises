package character1.session1;

import java.util.Arrays;

// 1.1.15
public class Histogram {
    private static int[] histogram(int a[], int M) {
        int[] array = new int[M];
        for (int item :
                a) {
            array[item] = item;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] testArray = {1,2,1,5,3,2,1,1};
        int M = 8;
        System.out.println(Arrays.toString(histogram(testArray, M)));
    }

}
