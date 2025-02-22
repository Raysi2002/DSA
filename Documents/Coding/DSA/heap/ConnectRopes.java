package heap;

import java.util.PriorityQueue;

public class ConnectRopes {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        System.out.println(connectRopes(arr));
    }

    static int connectRopes(int[] nums){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int totalCost = 0;
        for(int num : nums){
            minHeap.add(num);
        }
        while(minHeap.size() != 1){
            int sum = minHeap.poll() + minHeap.poll();
            totalCost += sum;
            minHeap.add(sum);
        }
        return totalCost;
    }
}
