// 9. Rotate an Array

// 	•	Problem: Rotate the elements of an array to the right by a given number k positions.
// Example:
// Input: {1, 2, 3, 4, 5}, k = 2
// Output: {4, 5, 1, 2, 3}

package arrays.problems;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        // System.out.println(Arrays.toString(rotateArrayByOnePlace(arr)));
        // System.out.println(Arrays.toString(rotateArray(arr, 2)));
        // System.out.println(Arrays.toString(reverseArr(arr, 2, arr.length-1)));
        System.out.println(Arrays.toString(rotateArray(arr, 11)));
        System.out.println(Arrays.toString(rotateArray2(arr, 11)));
    }
    //Rotating array by one place
    public static int[] rotateArrayByOnePlace(int[] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    // Rotating by k place
    // Input: {1, 2, 3, 4, 5}, k = 2
    //  Output: {4, 5, 1, 2, 3}


    public static int[] rotateArray2(int[] arr, int k){
        k = k % arr.length;
        int len = arr.length;
        int[] temp = new int[k+1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        for (int i = len - k; i < len; i++) {
            arr[i - k] = arr[i];
        }
        int pointer = 0;
        for (int i = len - k; i < len; i++) {
            arr[i] = temp[pointer];
            pointer++;
        }
        return arr;
    }

    //Optimal solution
    public static int[] rotateArray(int[] arr, int k){
        int len = arr.length - 1;
        k = k % arr.length;
        reverseArr(arr, 0, k);
        reverseArr(arr, k+1, len);
        reverseArr(arr, 0, len);
        return arr;
    }

    public static int[] reverseArr(int[] arr, int start, int end){
        int left = start;
        int right = end;
        for(int i = end; i >= start; i--){
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