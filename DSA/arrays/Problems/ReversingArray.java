// 2. Reverse an Array
// •	Problem: Write a program to reverse the elements of an array.
//  Example:
//  Input: {1, 2, 3, 4, 5}
//  Output: {5, 4, 3, 2, 1} 

package arrays.problems;

import java.util.*;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 6, 8, 10};
        reversedArray(arr);

        //Using StringBuffer reverse method
    }

    public static void reversedArray(int[] arr){
        int[] reversedArray = new int[arr.length];
        // int i = arr.length-1;
        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            reversedArray[j] = arr[i];
            j++; 
        }
        // while(i >= 0){
        //     reversedArray[j] = arr[i];
        //     i--;
        //     j++;
        // }
        System.out.println(Arrays.toString(reversedArray));
    }

}
