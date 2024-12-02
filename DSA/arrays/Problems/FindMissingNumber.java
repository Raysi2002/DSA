// 10. Find the Missing Number in an Array

// 	•	Problem: Given an array of n numbers, where all the numbers are from 1 to n + 1, find the missing number.
// Example:
// Input: {1, 2, 4, 5}, n = 5
// Output: 3


package arrays.problems;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9};
        int size = 9;
        System.out.println(findMissingNumber(arr, size));
    }
    //First thought (Resulted in O(n) complexity which is brute force for it)
    public static int findMissingNumber(int[] arr, int size){
        int missingNumber = -1;
        for (int i = 0; i < size; i++) {
            if(arr[i] != (arr[i+1] - 1))
                return arr[i] + 1;
        }
        return missingNumber;
    }
    //Optimal solution (Using Binary Search Tree) which will result in O(logn) complexity
    public static int findMissingNumberOptimalSolution(int[] arr, int size){
        int missingValue = -1;

        

        return missingValue;
    }
}
