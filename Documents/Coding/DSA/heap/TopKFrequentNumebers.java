package heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentNumebers {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2; //Output: [1,2]
        System.out.println(Arrays.toString(kFrequentNumebers(nums, k)));
    }

    static int[] kFrequentNumebers(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1); 
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            Comparator.comparingInt(Map.Entry :: getValue)
        );

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            minHeap.add(entry);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int i = 0;
        while (minHeap.size() != 0) {
            result[i] = minHeap.poll().getKey();
            i++;
        }
        return result;
    }
}
