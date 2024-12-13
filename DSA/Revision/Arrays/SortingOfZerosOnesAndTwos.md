Here’s your response formatted in .md:

Problem: Sorting of Zeros, Ones, and Twos

Solution Code

```//Optimal Solution (Dutch National Flag Algorithm)
public static int[] optimalSort(int[] arr) {
    int low = 0, mid = 0, high = arr.length - 1;
    while (mid != high + 1) {
        if (arr[mid] == 0) {
            int temp = arr[mid];
            arr[mid] = arr[low];
            arr[low] = temp;
            low++;
            mid++;
        } else if (arr[mid] == 1) {
            mid++;
        } else {
            int temp = arr[high];
            arr[high] = arr[mid];
            arr[mid] = temp;
            high--;
        }
    }
    return arr;
}```


Description
	•	Problem Summary:
	•	Sort an array containing only 0s, 1s, and 2s in ￼ time complexity using an in-place algorithm.
	•	Approach:
	•	Dutch National Flag Algorithm:
	•	Use three pointers:
	•	low → Boundary for 0s.
	•	mid → Current element pointer.
	•	high → Boundary for 2s.
	•	Logic:
	•	If arr[mid] == 0:
	•	Swap arr[mid] and arr[low], then increment low and mid.
	•	If arr[mid] == 1:
	•	Increment mid.
	•	If arr[mid] == 2:
	•	Swap arr[mid] and arr[high], then decrement high.
	•	Key Observations:
	•	Maintains three partitions dynamically:
	•	[0 to low-1] → Sorted 0s.
	•	[low to mid-1] → Sorted 1s.
	•	[high+1 to end] → Sorted 2s.
	•	Single traversal avoids unnecessary overhead.
	•	Time Complexity:
	•	￼: Single pass through the array.
	•	Space Complexity:
	•	￼: In-place swaps, no additional space.
	•	Key Concept:
	•	Dutch National Flag Algorithm is an efficient way to handle partitioning and sorting problems with fixed categories.

Let me know if you’d like this format refined further! 😊