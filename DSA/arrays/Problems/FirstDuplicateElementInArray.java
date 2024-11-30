// Find the Duplicate Element in an Array

// 	•	Problem: Given an array of integers, find the first duplicate element.
// Example:
// Input: {1, 2, 3, 4, 5, 2, 6}
// Output: 2


package arrays.problems;

public class FirstDuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 6, 1};
        System.out.println(returnFirstDuplicateElement(arr));
    }

    //Brute Force approach
    public static int returnFirstDuplicateElement(int[] arr){
        int firstDuplicate = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    return arr[i];
            }
        }

        return firstDuplicate;
    }

    //Waiting for best or optimal solution
}
