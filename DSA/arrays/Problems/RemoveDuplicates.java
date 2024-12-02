package arrays.problems;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates3(arr)));
        System.out.println(uniqueArraySize(arr));
    }
    public static SortedSet<Integer> removeDuplicates(int[] arr){
        SortedSet<Integer> set = new TreeSet();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set;
    }

    //For no new array creation
    public static int[] removeDuplicates2(int[] arr){
        SortedSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int i = 0;
        for(Integer element: set){
            arr[i] = element;
            i++;
        }
        return arr;
    }

    //Optimal Solution {1, 1, 2, 3, 3, 4, 5}
    public static int[] removeDuplicates3(int[] arr){
        int left = 0;
        int right = 1;
        int size = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[left] < arr[right]){
                arr[left+1] = arr[right];
                left++;
            }
            right++;
        }
        return arr;
    }
    public static int uniqueArraySize(int[] arr){
        int left = 0;
        int right = 1;
        int size = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[left] < arr[right]){
                arr[left+1] = arr[right];
                left++;
                size++;
            }
            right++;
        }
        
        return size;
    }
}
