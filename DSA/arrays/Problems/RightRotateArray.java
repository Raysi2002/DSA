package arrays.problems;

import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        System.out.println(Arrays.toString(rightRotateArray(arr, 3)));
    }

    public static int[] rightRotateArray(int[] arr, int k){
        k = k % arr.length;
        reverseArr(arr, 0, arr.length - 1);
        reverseArr(arr, k, arr.length - 1);
        return arr;
    }

    public static int[] reverseArr(int[] arr, int start, int end){
        int left = start;
        int right = end;
        for(int i = start; i < end; i++){
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }
}
