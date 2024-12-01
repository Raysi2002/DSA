package arrays.basics;

import java.util.Arrays;

public class ArrayEqualsMethod {
    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0};
        int[] arr2 = {0, 0, 0};
        int[][] arr3 = {{1, 2, 3}, {4, 3, 5}};
        System.out.println(Arrays.deepToString(arr3));
        if (Arrays.equals(arr1, arr2)) {
            System.out.println(Arrays.toString(arr1));
        }
        if (arr1.equals(arr2)) {
            System.out.println(Arrays.toString(arr1));
        }
    }
}
