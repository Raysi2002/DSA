package hashmap.problems;

import java.util.*;

public class MajorityElelemnts{
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int[] arr2 = {2, 2, 2, 2, 1, 1, 1, 1};
        int[] arr3 = {1, 2};
        // System.out.println(majorityElelemnts(arr2));
        System.out.println(MajorityElelemntsUsingHashMap(arr2));
    }

    //Brute Force approach
    static List<Integer> majorityElelemnts(int[] arr){
        List<Integer> list = new ArrayList<>();
        int majority = arr.length / 3;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(!list.contains(arr[i])){
                if(count > majority)
                    list.add(arr[i]);
            }
        }
        return list;
    }

    //HashMap Solution
    //arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
    static List<Integer> MajorityElelemntsUsingHashMap(int[] nums){
        int n = nums.length;
        int majority = n / 3;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > majority)
                list.add(entry.getKey());
        }
        return list;
    }
}