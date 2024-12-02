package arrays.problems;

import java.util.ArrayList;
import java.util.List;

public class AllSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 8};
        System.out.println(allSubArrays(arr));
    }

    public static List<List<Integer>> allSubArrays(int[] arr){
        List<List<Integer>> subArrays = new ArrayList<>();
        // List<List<Integer>> subArrays = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                ArrayList<Integer> subList = new ArrayList<>();
                for(int k = i; k <= j; k++){
                    subList.add(arr[k]);
                }
                subArrays.add(subList);
            }
        }
        return subArrays;
    }
}
