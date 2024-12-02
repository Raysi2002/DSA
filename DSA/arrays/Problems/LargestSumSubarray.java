// 8. Find the Largest Sum Contiguous Subarray (Kadane’s Algorithm)

// 	•	Problem: Given an array of integers, find the contiguous subarray with the largest sum.
// Example:
// Input: {1, -2, 3, 4, -1, 2, 1, -5, 4, 5, -4}
// Output: 7 (subarray [3, 4, -1, 2, 1])

package arrays.problems;

public class LargestSumSubarray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4, 5, -4};
        System.out.println(largestSum(arr));
    }
    //Bruteforce approach
    public static int largestSum(int[] arr){
        int largestSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = Integer.MIN_VALUE;
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 < j; j2++) {
                    currentSum += arr[j2];
                    largestSum = Math.max(largestSum, j2);
                }
            }
        }
        return largestSum;
    }
    //Optimal approach (Kadane's Algorithm)
    public
}
