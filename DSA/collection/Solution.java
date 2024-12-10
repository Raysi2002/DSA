package collection;

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 2, 5, 6, 7};
        System.out.println(arr);
    }
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        reverseArrayList(arr, m, arr.size() - 1);
    }

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> arr, int start, int end){
        int i = start, j = end;
        while(start < end){
            int x = arr.get(i);
            int y = arr.get(j);
            int temp = x;
            x = y;
            y = temp;
            start++;
            end--;
            i = start;
            j = end;
        }
        return arr;
    }
}
