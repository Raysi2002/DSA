package arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingOfZerosOnesTwos {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 0, 0, 0, 2, 2, 1, 1, 0, 2, 2};
        int[] arr2 = {2, 2, 2, 2, 0, 0, 1, 0};
        // System.out.println(Arrays.toString(betterSortedArray(arr2)));
        System.out.println(Arrays.toString(optimalSort(arr2)));
        System.out.println(Arrays.toString(optimalSort(arr)));
    }

    //Brute Force approach
    public static int[] sortedArray(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    //Better appraoch
    public static int[] betterSortedArray(int[] arr){

        int one = 0, two = 0, zero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)
                zero++;
            else if(arr[i] == 1)
                one++;
            else
                two++;
        }
        for(int i = 0; i < zero; i++){
            arr[i] = 0;
        }
        for(int i = zero; i < zero + one; i++){
            arr[i] = 1;
        }
        for(int i = (zero + one); i < arr.length; i++){
            arr[i] = 2;
        }
        return arr;
    }

    //Optimal Solution (Dutch National Flag Algorithm)
    public static int[] optimalSort(int[] arr){

        int low = 0, mid = 0, high = arr.length - 1;
        while (mid != high + 1) {
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }

        return arr;
    }

    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < n; i++) {
            if(arr.get(i) == 0)
                zero++;
            else if(arr.get(i) == 1)
                one++;
            else
                two++;
        }
        for(int i = 0; i < zero; i++){
            arr.set(i, 0);
        }
        for(int i = zero; i < (zero + one); i++){
            arr.set(i, 1);
        }
        for(int i = (zero + one); i < n; i++){
            arr.set(i, 2);
        }
    }
}
