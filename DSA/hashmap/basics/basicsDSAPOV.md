### A HashMap is a data structure that maps keys to values. Its underlying implementation often uses an array for storage, leveraging hashing to achieve efficient lookups, insertions, and deletions.

## Basics of HashMap Using an Array:
	1.	Array for Buckets:
	•	A HashMap is backed by an array, where each array index is called a bucket.
	•	The size of this array is typically fixed initially, but it can resize dynamically to maintain efficiency.
	2.	Hash Function:
	•	A hash function converts a key into an integer, which is then used to calculate an index in the array:
    ## 	Operations:
	•	Insertion:
	1.	Compute the hash of the key.
	2.	Map it to an index using modulo.
	3.	Store the key-value pair in the bucket (handle collisions if needed).
	•	Search:
	1.	Compute the hash of the key.
	2.	Look in the appropriate bucket.
	3.	Iterate through the bucket (if collisions exist) to find the key.
	###	Deletion:
	1.	Compute the hash of the key.
	2.	Locate the key in the bucket and remove it.
	5.	Resizing:
	•	When the load factor (number of elements / size of the array) exceeds a threshold, the array is resized (usually doubled) and rehashed to distribute keys across the new buckets.```

```3.	Collision Handling:
	1. Multiple keys may hash to the same index (collision). This is handled using techniques like:
	2.	Chaining: Each bucket stores a linked list (or another collection) of key-value pairs.
	3. 	Open Addressing: Keys are placed in the next available bucket within the array.```

```Example in Code:

Using an array to implement a basic HashMap:

class HashMapUsingArray {
    private static class Node {
        String key;
        int value;
        Node next; // For chaining
        Node(String key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] buckets;
    private int size;
    private final double LOAD_FACTOR = 0.75;

    public HashMapUsingArray(int capacity) {
        buckets = new Node[capacity];
        size = 0;
    }

    private int getIndex(String key) {
        int hash = key.hashCode();
        return Math.abs(hash) % buckets.length;
    }

    public void put(String key, int value) {
        int index = getIndex(key);
        Node head = buckets[index];

        // Update value if key exists
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert new node
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;

        // Resize if necessary
        if ((double) size / buckets.length > LOAD_FACTOR) {
            resize();
        }
    }

    public Integer get(String key) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null; // Key not found
    }

    private void resize() {
        Node[] oldBuckets = buckets;
        buckets = new Node[oldBuckets.length * 2];
        size = 0;

        for (Node head : oldBuckets) {
            while (head != null) {
                put(head.key, head.value); // Rehash keys
                head = head.next;
            }
        }
    }
}
```
## Key Points:
	•	Time Complexity:
	•	Average case: ￼ for insertion, search, and deletion.
	•	Worst case (collision-heavy): ￼, but this is rare with a good hash function and proper resizing.
	•	Space Complexity:
	•	￼, where ￼ is the number of elements and ￼ is the bucket array size.

This is the foundation for understanding how HashMaps work internally using arrays!