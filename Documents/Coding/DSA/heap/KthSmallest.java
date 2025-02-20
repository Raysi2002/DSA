package heap;

import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println(kthSmallest(arr, 3));
    }

    public static int kthSmallest(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for(int num : arr){
            maxHeap.add(num);
            k--;
            if(k < 0){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}
