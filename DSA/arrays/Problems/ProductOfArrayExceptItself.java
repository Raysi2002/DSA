// 17. Product of Array Except Itself

// 	•	Problem: Given an array of integers, return a new array such that each element at index i is the product of all elements in the original array except the element at i.
// Example:
// Input: {1, 2, 3, 4}
// Output: {24, 12, 8, 6}


package arrays.problems;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productOfArrayExceptItself(arr)));
    }

    public static int[] productOfArrayExceptItself(int[] arr){
        int len = arr.length;
        int[] productArr = new int[len];

        for (int i = 0; i < len; i++) {
            int currentProduct = 1;
            for (int j = 0; j < len; j++) {
                if(arr[i] == arr[j]){
                    //Do nothing
                }
                else{
                    currentProduct *= arr[j];
                }
            }
            productArr[i] = currentProduct;
        }
        return productArr;
    }
}
