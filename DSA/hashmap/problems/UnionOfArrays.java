package hashmap.problems;

import java.util.*;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = { 2, 3, 4, 5, 6};
        System.out.println(union(arr, arr2));
        System.out.println(unionSize(arr, arr2));
        System.out.println(unionSet(arr, arr2));
    }

    //Using HashSet
    static HashSet<Integer> unionSet(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            set.add(nums2[i]);
        }
        return set;
    } 

    //HashMap 
    static List<Integer> union(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){
            hashMap.put(arr1[i], arr1[i]);
        }
        for(int j = 0; j < arr2.length; j++){
            hashMap.put(arr2[j], arr2[j]);
        }
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            list.add(entry.getKey());
        }
        return list;
    }

    //If only size is asked:
    public static int unionSize(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> hashMap = new HashMap<>();


        for(int i = 0; i < arr1.length; i++){
            hashMap.put(arr1[i], arr1[i]);
        }
        for(int j = 0; j < arr2.length; j++){
            hashMap.put(arr2[j], arr2[j]);
        }

        return hashMap.size();
    }
}
