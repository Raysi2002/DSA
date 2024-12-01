// 7. Check if the Array is Sorted

// 	•	Problem: Check whether an array is sorted in ascending order.
// Example:
// Input: {1, 2, 3, 4, 5}
// Output: true
// Input: {1, 3, 2, 4, 5}
// Output: false



package arrays.problems;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 13, 14, 14, 15};
        // int[] arr = {1, 3, 2, 4, 5};

        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr){
        boolean isSorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] <= arr[i+1])
                    isSorted = true;
                else{
                    isSorted = false;
                    break;
                }
                    

            }
        return isSorted;
    }
}
