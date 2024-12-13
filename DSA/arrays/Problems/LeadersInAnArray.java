package arrays.problems;

import java.util.*;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1};
        System.out.println(leadersInAnArray(arr));
    }

    //Optimal Solution
    public static List<Integer> leadersInAnArray(int[] arr){
        List<Integer> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] > max){
                list.add(arr[i]);
                max = arr[i];
            }
        }
        return list;
    }
}
