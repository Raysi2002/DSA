// 13. Check for Palindrome Array

// 	•	Problem: Check whether an array is a palindrome (i.e., the array reads the same forward and backward).
// Example:
// Input: {1, 2, 3, 2, 1}
// Output: true
// Input: {1, 2, 3, 4, 5}
// Output: false


package arrays.problems;

public class CheckPalindromeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        // int[] arr = {1, 2, 3, 4, 5, 1};
        System.out.println(isPalindrome(arr));
    }

    //First Thought (using double pointer)
    public static boolean isPalindrome(int[] arr){
        boolean isPalindrome = false;
        int leftPointer = 0;
        int rightPointer = arr.length - 1;

        for (int i = 0; i < arr.length / 2; i++) {
            if(arr[leftPointer] == arr[rightPointer]){
                isPalindrome = true;
                leftPointer++;
                rightPointer--;
            }
            else{
                isPalindrome = false;
                break;
            }
                
        }
        return isPalindrome;
    }
}
