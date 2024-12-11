package arrays.problems;

import java.util.Arrays;

public class RearrangeElements {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeElements(arr)));
    }

    //Brute Force method
    public static int[] rearrangeElements(int[] arr){

        int n = arr.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int posIndex = 0, negIndex = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                pos[posIndex++] = arr[i];
            }else{
                neg[negIndex++] = arr[i];
            }

        }

        for(int i = 0; i < n/2; i++){
            arr[i * 2] = pos[i];
            arr[2 * i + 1] = neg[i];
        }
        return arr;
    }

    // public static int[] rearrangeElements(int[] arr){

    //     int left = 0;
    //     int right = 1;
    //     for(int i = 0; i < arr.length - 1; i++){
    //         if(arr[left] >= 0){
    //             if(arr[right] < 0){
    //                 left++;
    //                 right++;
    //             }else{
                    
    //             }
    //         }else{

    //         }
    //     }

    //     return arr;
    // }
}
