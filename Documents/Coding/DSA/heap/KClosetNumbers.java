package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosetNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(kClosetNumbers(arr, 3, 7)));
    }

    static int[] kClosetNumbers(int[] nums, int k, int x){
        int[] result = new int[k];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            if (b[0] != a[0]) return b[0] - a[0]; // Sort by greater difference
            return b[1] - a[1];
        });
        for(int num : nums){
            maxHeap.add(new int[]{Math.abs(num - x), num});
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        int i = 0;
        while (maxHeap.size() != 0) {
            result[i] = maxHeap.poll()[1];
            i++;
        }
        return result;
    }
}
