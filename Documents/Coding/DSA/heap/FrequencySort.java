package heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 2, 2, 4};
        System.out.println(Arrays.toString(frequencySort(arr)));
    }

    static int[] frequencySort(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        maxHeap.addAll(map.entrySet());
        int ind = 0;
        while (maxHeap.size() != 0) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            int key = entry.getKey();
            int value = entry.getValue();
            for(int i = 0; i < value; i++){
                arr[ind] = key;
                ind++;
            }
        }
        return arr;
    }
}
