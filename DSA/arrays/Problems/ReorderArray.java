// Input: nums = [24, 56, 74, -23, 87, 91], indexes = [1, 2, 3, 0, 4, 5]
// Output: [56, 74, -23, 24, 87, 91]

package arrays.problems;

import java.util.Arrays;

public class ReorderArray {
    public static void main(String[] args) {
        int[] arr = {24, 56, 74, -23, 87, 91};
        int[] indexes = {1, 2, 3, 0, 4, 5};
        System.out.println(Arrays.toString(reorderArray(arr, indexes)));
    }

    static int[] reorderArray(int[] arr, int[] indexes){
        int n = arr.length;
        int[] rearrangedArr = new int[n];

        for (int i = 0; i < n; i++) {
            int index = indexes[i];
            rearrangedArr[i] =  arr[index];
        }

        return rearrangedArr;
    }

}
