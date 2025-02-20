package heap;

import java.util.PriorityQueue;

public class Basics {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(30);
        minHeap.add(5);
        minHeap.add(3);
        System.out.println(minHeap);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.addAll(minHeap);
        System.out.println(maxHeap);
    }
}
