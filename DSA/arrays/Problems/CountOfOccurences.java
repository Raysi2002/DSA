// Count the Number of Occurrences of an Element in an Array

// 	•	Problem: Count how many times a given element appears in an array.
// Example:
// Input: {1, 2, 3, 1, 2, 1, 4}, Element: 1
// Output: 3

package arrays.problems;
public class CountOfOccurences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1, 6, 4, 1, 2, 3, 4, 2, 4, 5, 1, 2, 4, 5, 1, 2};
        int element = 1;
        int element2 = 5;
        System.out.println(totalCount(arr, element));
        System.out.println(totalCount(arr, element2));
    }
    public static int totalCount(int[] arr, int element){
        int totalCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element)
                totalCount++;
        }
        return totalCount;
    }
}
