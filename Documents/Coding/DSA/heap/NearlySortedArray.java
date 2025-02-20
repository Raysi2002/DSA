package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NearlySortedArray {
    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        nearlySortedArray(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void nearlySortedArray(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size() > k){
                arr[j] = minHeap.poll();
                j++;
            }
        }
        while (minHeap.size() != 0) {
            arr[j] = minHeap.poll();
            j++;
        }
    }
}
