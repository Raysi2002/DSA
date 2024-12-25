
// 4. Group Elements by Frequency
// 	•	Problem: Given an array, group elements by their frequency.
// 	•	Example:

// Input: [1, 2, 2, 3, 3, 3]
// Output: {1=[1], 2=[2, 2], 3=[3, 3, 3]}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupElementByFrequency {
    public static void main(String[] args) {
        // int[] nums = {1, 2, 2, 3, 3, 3};
        int[] nums = {2, 3, 5, 6, 2, 4, 5, 3, 2, 1, 4, 5};
        System.out.println(groupElement(nums));
    }

    //Brute Force
    static List<List<Integer>> groupElement(int[] arr){
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Integer key : map.keySet()){
            List<Integer> tempList = new ArrayList<>();
            for(int i = 0; i < map.get(key); i++){
                tempList.add(key);
            }
            list.add(tempList);
        }
        return list;
    }

    // static List<List<Integer>> groupElementByFrequency(int[] nums){
    //     List<List<Integer>> list = new ArrayList<>();

    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for(int num : nums){
    //         map.put(num, map.getOrDefault(num, 0) + 1);
    //     }
    //     for(int i = 0; i < map.size(); i++){
            
    //     }   
    //     return list;
    // }
}
