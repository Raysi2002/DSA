// 3. Move All Zeros to the End

// 	•	Problem: Given an array, move all the zeros to the end without changing the relative order of the non-zero elements.
// Example:
// Input: {0, 1, 0, 3, 12}
// Output: {1, 3, 12, 0, 0}


package arrays.problems;
import java.util.*;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        // int[] arr = {0, 1, 0, 3, 12};
        // int[] arr = {2, 3, 0, 1, 9};
        int[] arr = {1, 8, 0 ,0 , 8, 2, 0, 7, 0, 0, 1};
        System.out.println(Arrays.toString(moveZerosToEnd(arr)));
    }

    //Initial thought
    public static int[] moveZeroToEnd(int[] arr){
        int leftPointer = arr[0];
        int rightPointer = arr[1];
        int leftPointerIndex = 0;
        int rightPointerIndex = 0;
        for(int i = 0; i < arr.length ; i++){
            if(rightPointerIndex < arr.length - 1 ){
                if(leftPointer == 0 && rightPointer != 0){
                    int temp = arr[leftPointerIndex];
                    arr[leftPointerIndex] = arr[rightPointerIndex];
                    arr[rightPointerIndex] = temp;
                    leftPointerIndex++;
                    rightPointerIndex++;
                    leftPointer = arr[leftPointerIndex];
                    rightPointer = arr[rightPointerIndex];
                }
                else if(leftPointer== 0 && rightPointer == 0){
                    rightPointerIndex++;
                    rightPointer = arr[rightPointerIndex];
                }
                else{

                    leftPointerIndex++;
                    rightPointerIndex++;
                    leftPointer = arr[leftPointerIndex];
                    rightPointer = arr[rightPointerIndex];
                }
            }
        }
        return arr;
    }

    // My later approach
    public static int[] moveZerosToEnd(int[] arr){
        int leftPointerIndex = 0;
        int rightPointerIndex = 0;

        while(rightPointerIndex < arr.length){
            if(arr[leftPointerIndex] == 0 && arr[rightPointerIndex] != 0){
                int temp = arr[leftPointerIndex];
                arr[leftPointerIndex] = arr[rightPointerIndex];
                arr[rightPointerIndex] = temp;
                leftPointerIndex++;
            }
            rightPointerIndex++;
        }
        return arr;
    }

    //ChatGPT Approach
    public static int[] moveZeroToEnd2(int[] arr){
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }

}
