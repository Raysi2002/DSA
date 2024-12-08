package arrays.problems;

import java.util.*;


public class TwoSum{
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 6, 3}; 
        int k = 100;
        System.out.println(Arrays.toString(twoSum2(arr, k)));
        System.out.println(twoSumOptimal(arr, k));
    }

    //Brute Force approach (Only to return if present of not )
    public static boolean twoSum(int[] arr, int k){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] + arr[j] == k){
                    return true;
                }
            }
        }
        return false;
    }

    //Brute Force (Return the indexes)
    public static int[] twoSum2(int[] arr, int k){
        int[] index = {-1, -1};
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] + arr[j] == k){
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }
        }
        return index;
    }

    // Optimal for variety-1 (Using 2 pointers approach)
    // int[] arr = {1, 4, 6, 2, 6, 3}; 
    public static boolean twoSumOptimal(int[] arr, int target){
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        // int sum = arr[left] + arr[right];
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target)
                return true;
            else if(sum > target)
                right--;
            else
                left++;
        }
        return false;
    }

}