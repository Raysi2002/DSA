package arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAtKPosition{
    public static void main(String[] args) {
        // Output: 10 4 5 2 6 3 1 6 3 
        //         10, 4, 5, 2, 3, 6, 1, 3, 6
        Integer[] arr = {10, 4, 5, 2, 3, 6, 1, 3, 6};
        // int[] arr = {1, 4, 5, 6, 6, 7, 7};
        int k = 3;
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(arr));
        // System.out.println(Arrays.toString(reverseArrayAtKPosition(arr, k)));
        reverseArray(arrList, k);
    }

    //Two pointer approach
    public static int[] reverseArrayAtKPosition(int[] arr, int k){
        int left = k+1;
        int right = arr.length - 1;
        for (int i = k+1; i < arr.length ; i++) {
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            left++;
            right--;
        }
        return arr;
    }

    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int left = m + 1;
        int right = arr.size() - 1;
        for (int i = m+1; i < arr.size(); i++) {
            if(left < right){
                int temp = arr.get(left);
                arr.set(left, arr.get(right)); // Update value at index 'left'
                arr.set(right, temp);         // Update value at index 'right'
            }
            left++;
            right--;
        }
        for(Integer num:arr){
            System.out.print(num + " ");
        }
    }
}