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
        System.out.println(Arrays.toString(rotateArray(arr, 2)));
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

    //Rotating by k place
    // Input: {1, 2, 3, 4, 5}, k = 2
    //  Output: {4, 5, 1, 2, 3}

    public static int[] rotateArray(int[] arr, int k){

        int[] tempArr = new int[k];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[k];
        }
        // for (int i = k + 1; i < arr.length; i++) {
        //     arr[i] = tempArr[i-k];
        // }
        return arr;
    }
}