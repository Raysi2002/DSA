package arrays.problems;

import java.util.*;

public class LongestConseutiveSequence {
    public static void main(String[] args) {
        // int[] arr = {};
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // int[] arr = {100, 200, 4, 2, 1, 3};
        System.out.println(longestConseutiveSequence(arr));
    }

    static int longestConseutiveSequence(int[] arr){
        int count = 0;

        HashSet<Integer> set = new HashSet<>();
        // array elements transferred to hash set
        for(int num : arr){
            set.add(num);
        }

        for(Integer num : set){
            //If hash set contains less than the current number, we'll do nothing
            //If it doesn't contains num - 1 number than that means that is our starting point and we need to start from there
            if(!set.contains(num - 1)){
                //set the currentNum to track the next numbers
                int currentNum = num;
                //Set the cuurentCount to track the current  streak
                int currentCount = 1;
                //Check upto how long the current streak is going
                while(set.contains(currentNum + 1)){
                    // if found update both currentNum and currentCount by 1
                    currentNum++;
                    currentCount++;
                }
                //check the largest out of currentCount and count
                count = Math.max(count, currentCount);
            }
        }

        return count;
    }
}
