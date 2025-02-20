Heap in Data Structures: A Detailed Explanation

1. Introduction to Heap

A heap is a specialized tree-based data structure that satisfies the heap property. It is mainly used to implement priority queues and efficiently manage dynamic sets.

A binary heap is the most common type, which is a complete binary tree that follows specific ordering properties.

2. Types of Heap

There are two main types of heaps based on the ordering property:

a. Min Heap
	•	The parent node is always less than or equal to its child nodes.
	•	The root always contains the smallest element in the heap.
	•	Example:

     5
    /   \
   10   20
  /  \  /  \
 30  40 50  60



b. Max Heap
	•	The parent node is always greater than or equal to its child nodes.
	•	The root always contains the largest element in the heap.
	•	Example:

     50
    /   \
   30    40
  /  \   /  \
 10   5 20  15

3. Properties of Heap
	1.	Complete Binary Tree:
	•	A heap is always a complete binary tree, meaning all levels are completely filled except possibly the last one, which is filled from left to right.
	2.	Heap Order Property:
	•	Every node follows the min-heap or max-heap ordering property.
	3.	Efficient Access to the Root:
	•	The minimum (min-heap) or maximum (max-heap) element is always available in O(1) time.

4. Heap Operations

a. Insertion (O(log N))
	1.	Insert the element at the next available position to maintain completeness.
	2.	Heapify Up (Bubble Up): Compare the inserted node with its parent and swap if necessary.
	3.	Continue until the heap property is satisfied.

Example (Min Heap)

Insert 3 into this heap:

       5
      /   \
     10   20

Step 1: Insert 3 at the next available position.

       5
      /   \
     10   20
    /
   3

Step 2: Swap 3 with 5 (heapify up).

       3
      /   \
     10   20
    /
   5

b. Deletion (O(log N))
	1.	Remove the root (min or max).
	2.	Replace the root with the last node.
	3.	Heapify Down (Sink Down): Swap the new root with the smallest (min-heap) or largest (max-heap) child until the heap property is restored.

Example (Min Heap)

Delete 5 from:

       5
      /   \
     10   20
    /
   30

Step 1: Replace 5 with the last node 30.

       30
      /   \
     10   20

Step 2: Swap 30 with 10 (heapify down).

       10
      /   \
     30   20

c. Heapify (O(N))
	•	Converts an unordered array into a valid heap using heapify-down.
	•	Used in Heap Sort.

d. Peek (O(1))
	•	Returns the minimum (min-heap) or maximum (max-heap) element without removing it.

5. Applications of Heap

a. Priority Queue
	•	Used in Dijkstra’s shortest path, job scheduling, and AI algorithms.

b. Heap Sort (O(N log N))
	•	A comparison-based sorting algorithm using a heap.

c. Graph Algorithms
	•	Dijkstra’s Algorithm and Prim’s Algorithm use a min-heap.

d. Median Finding
	•	Uses two heaps: max-heap for the left half and min-heap for the right half.

6. Heap Implementation in Java

import java.util.PriorityQueue;

public class HeapExample {
    public static void main(String[] args) {
        // Min Heap (Default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(30);
        
        System.out.println("Min element: " + minHeap.peek()); // Output: 5
        System.out.println("Remove Min: " + minHeap.poll()); // Output: 5
    }
}

For a max heap, use:

PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

7. Time Complexity Analysis

Operation	Average Time Complexity
Insertion	O(log N)
Deletion	O(log N)
Heapify	O(N)
Peek	O(1)

8. Conclusion
	•	Heaps are efficient priority queue implementations.
	•	Min-heaps store the smallest element at the top, while max-heaps store the largest.
	•	Commonly used in sorting, graph algorithms, and scheduling tasks.