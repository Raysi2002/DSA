package arrays.problems;

import java.util.Arrays;

public class SecondLargestElement{
    public static void main(String[] args) {
        int[] arr = {7, 4, 3, 3, 8, 8, 9, 1};
        // int[] arr = {9, 9, 9, 9};
        System.out.println(findSecondLargerst(arr));
    }

    //My initial thought (Congrats it's optimal solution)
    public static int secondLargerst(int[] arr){
        int secondLargerst = arr[0];
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > secondLargerst && arr[i] < largest)
                secondLargerst = arr[i];
            else
                return -1;
        }
        return secondLargerst;
    }

    //Brute Force approach
    public static int findSecondLargerst(int[] arr){
        int secondLargerst = -1;
        Arrays.sort(arr); //NLogN Complexity
        int largest = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] != largest){
                secondLargerst = arr[i];
                break;
            }
        }
        return secondLargerst;
    }
}