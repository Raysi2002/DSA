// 5. Find the Intersection of Two Arrays

// 	•	Problem: Given two arrays, find the common elements (intersection).
// Example:
// Input: {1, 2, 3, 4, 5}, {4, 5, 6, 7, 8}
// Output: {4, 5}


package arrays.problems;
import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        intersectionOfTwoArrays(arr1, arr2);
    }

    //Without using inbuilt method
    //BruteForce approach
    public static void intersectionOfTwoArrays(int[] arr1, int[] arr2){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        while (k < arr1.length && l < arr2.length) {
            while (i < arr1.length && j < arr2.length) {
                if(arr1[i] == arr2[k])
                    arrayList.add(arr1[i]);
                i++;
                j++;
            }
            k++;
            l++;
        }
        System.out.println(arrayList);
    }   
}
