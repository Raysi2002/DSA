// Find the Maximum and Minimum Element in an Array

// 	•	Problem: Given an array of integers, find the maximum and minimum elements in the array.
// Example:
// Input: {1, 5, 3, 9, 2}
// Output:
// Maximum: 9
// Minimum: 1

package arrays.Problems;

public class MaxMinElement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 2};
        System.out.println("MaxElement: " + maxElement(arr));
        System.out.println("MaxElement: " + minElement(arr));
    }

    public static int maxElement(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int minElement(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
