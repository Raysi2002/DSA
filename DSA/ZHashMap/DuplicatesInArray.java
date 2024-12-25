// 3. Find Duplicates in an Array
// 	•	Problem: Find all elements that appear more than once in an array.
// 	•	Example:

// Input: [4, 3, 2, 7, 8, 2, 3, 1]
// Output: [2, 3]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.HashSet;

public class DuplicatesInArray {
    public static void main(String[] args) {
        // int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums = {3, 4, 5, 7, 8, 1, 2, 1, 3};
        System.out.println(duplicatesInArray(nums));
    }

    static List<Integer> duplicatesInArray(int[] nums){
        Set<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > 1)
                set.add(num);
        }
        List<Integer> list = set.stream().collect(Collectors.toList());
        return list;
    }

    //Most optimal solution (Saw it from )
}
